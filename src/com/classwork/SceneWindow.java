package com.classwork;

import javax.swing.*;
import java.awt.*;

public class SceneWindow extends JFrame {

    public SceneWindow(){
        setVisible(true);
        setTitle("Graphics 8");
        setSize(2000,1000);
        setLayout(new GridLayout(2,2));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CubePanel cubePanel = new CubePanel();
        JButton button = new JButton("Rotate");
        add(cubePanel);
        add(button);

    }

    public static void main(String[]args){
        new SceneWindow();
    }
}
