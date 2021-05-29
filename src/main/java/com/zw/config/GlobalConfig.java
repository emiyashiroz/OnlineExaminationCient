package com.zw.config;

import com.zw.annotation.Resource;

import javax.swing.*;
import java.net.URL;

@Resource
public class GlobalConfig {
    public final static String loginName = "在线考试客户端-登录";
    public final static String loginIcon = "bg.jpg";
    private String classPath = "";

    public static ImageIcon getImageIcon(String name){
        //return new ImageIcon(GlobalConfig.class.getResource(imgDir + '/' + name));
        return null;
    }

    public GlobalConfig(){

    }

    private String getClassPath(){
        if("".equals(this.classPath)){
            this.classPath = this.getClass().getClassLoader().getResource("").getPath();
        }
        return this.classPath;
    }

    public ImageIcon getImageIcon(){
        return new ImageIcon(this.getClassPath() + "imgs/" + "bg.jpg");
    }

    public static void main(String[] args) {
        //ImageIcon testIcon = getImageIcon("bg.jpg");
        GlobalConfig globalConfig = new GlobalConfig();
        System.out.println(globalConfig.getClassPath());
        ImageIcon icon = globalConfig.getImageIcon();
    }
}
