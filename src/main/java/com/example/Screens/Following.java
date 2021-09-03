package com.example.Screens;

import java.awt.Font;

import javax.swing.JLabel;

import org.json.JSONObject;

public class Following extends JLabel {
    public Following(JSONObject obj){
        JSONObject ob1 = obj.getJSONObject("graphql");
        JSONObject ob2 = ob1.getJSONObject("user");
        JSONObject ob3 = ob2.getJSONObject("edge_follow");
        String following = ob3.getNumber("count").toString();
        this.setBounds(20,640,600,20);
        this.setText("Number of Following : " + following);
        this.setFont(new Font("Italic",Font.PLAIN,18));
        this.setLayout(null);
    }

}
