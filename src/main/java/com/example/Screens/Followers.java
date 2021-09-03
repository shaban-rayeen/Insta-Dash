package com.example.Screens;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

import org.json.JSONObject;

public class Followers extends JLabel {
    public Followers(JSONObject obj){
        JSONObject ob1 = obj.getJSONObject("graphql");
        JSONObject ob2 = ob1.getJSONObject("user");
        JSONObject ob3 = ob2.getJSONObject("edge_followed_by");
        String followers = ob3.getNumber("count").toString();
        this.setBounds(20,640,700,30);
        this.setText("Number of Followers : " + followers);
        this.setFont(new Font("Italic",Font.PLAIN,18));
        this.setBackground(Color.black);
        this.setForeground(Color.black);
        this.setLayout(null);
    }

}
