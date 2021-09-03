package com.example.Screens;

import java.awt.Font;

import javax.swing.JLabel;

import org.json.JSONObject;

public class FullName extends JLabel {
    public FullName(JSONObject obj){
        JSONObject ob1 = obj.getJSONObject("graphql");
        JSONObject ob2 = ob1.getJSONObject("user");
        String fullName = ob2.getString("full_name");
        // String following = ob3.getNumber("count").toString();
        this.setBounds(20,640,600,20);
        this.setText("Name : " + fullName);
        this.setFont(new Font("Italic",Font.PLAIN,18));
        this.setLayout(null);
    }

}
