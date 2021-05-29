package com.zw.ui;

import com.zw.config.GlobalConfig;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

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

    /*
    资源容器
     */
    private Map<String, Object> container = new HashMap<>();

    private void initContainer(){
        //todo: 通过注解的方式注入
        //container.put("globalConfig", new GlobalConfig());
        //通过@Resource 注入所有的资源对象
        //通过@Autowired 自动装配所有的资源对象
    }

    public Object getResource(String name){
        return container.get(name);
    }

    public LoginInterface(String name){

        this.setTitle(GlobalConfig.loginName);
        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());
        JPanel mainPanel = new JPanel();
        container.add(mainPanel);

        this.setSize(800, 600);
        this.setLocation(400, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//添加系统退出事件
        this.validate();
        initContainer();
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
            }
        });
        System.out.println("hello Swing");
    }
}