package com.example.Screens;

import java.awt.Color;

//  import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import com.example.Service.*;

import org.json.JSONObject;

import java.awt.Font;
import java.io.IOException;

public class HomePage {

    public HomePage() {
        JFrame frame = new JFrame("Instagram Dashboard");
        JTextField textField = new JTextField();

        textField.setText("shabistic");
        textField.setBounds(150, 50, 380, 40);
        textField.setFont(new Font("Aerial", Font.PLAIN, 20));
        textField.setBackground(Color.white);
        textField.setForeground(Color.black);
        textField.setLayout(null);

        JButton button = new JButton("GET");
        button.setFocusable(false);
        button.setBounds(570, 50, 80, 40);
        button.setBackground(Color.red);
        button.setForeground(Color.black);
        button.setFont(new Font("Callibri", Font.BOLD + Font.ITALIC, 20));
        button.setLayout(null);
        button.addActionListener(e -> {
            String username = textField.getText().trim();
            try {
                JSONObject obj = new service().get("https://www.instagram.com/" + username + "/?__a=1");

                System.out.println(obj);
                frame.add(new ShowImage(obj));
                frame.add(new FullName(obj));
                frame.add(new Posts(obj));
                frame.add(new Followers(obj));
                frame.add(new Following(obj));
                frame.repaint();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        });

        frame.setSize(800, 800);
        frame.getContentPane().setBackground((Color.white));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(3);
        frame.setResizable(false);
        frame.add(textField);
        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);

    }

}