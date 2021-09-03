package com.example.Screens;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import org.json.JSONObject;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import java.awt.Image;

public class ShowImage extends JLabel {
    public ShowImage(JSONObject obj) {
        JSONObject ob1 = obj.getJSONObject("graphql");
        JSONObject ob2 = ob1.getJSONObject("user");
        String imgUrl = ob2.getString("profile_pic_url_hd");
        // URL url;
        try {
            System.out.println("Shabistic" + imgUrl);
            URL url = new URL(imgUrl);
            Image image = ImageIO.read(url);
            image.getScaledInstance(200, 200, Image.SCALE_SMOOTH);

            this.setBounds(20, 230, 600, 300);
            this.setIcon(new ImageIcon(image));
            // this.setText("Name : " + obj.getString("name"));
            
            this.setFont(new Font("Aerial", Font.PLAIN, 18));
            this.setForeground(Color.white);
            this.repaint();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // this.setBackground(new Color(23, 23, 23));
        this.setLayout(null);

    }

}
