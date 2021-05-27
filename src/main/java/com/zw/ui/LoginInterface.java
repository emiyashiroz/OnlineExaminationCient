package com.zw.ui;

import javax.swing.*;
import java.awt.*;

public class LoginInterface extends JFrame{
    {
        // Set Look & Feel
        try {
            javax.swing.UIManager
                    .setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private JButton btn_test = null;
    private JPanel panel_test = null;
    public LoginInterface(String name){
        this.setName(name);
        panel_test = new JPanel();
        this.setContentPane(panel_test);
        btn_test = new JButton("test");
        panel_test.add(btn_test);
        this.setSize(400, 400);
        this.setLocation(200, 200);
    }

    public static void main(String[] args) {
        try
        {
            org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.getBeautyEyeLNFStrCrossPlatform();
        } catch(Exception e)
        {
            //TODO exception
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginInterface frame = new LoginInterface("在线考试系统");
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//添加系统退出事件
                frame.validate();
            }
        });
        System.out.println("hello Swing");
    }
}