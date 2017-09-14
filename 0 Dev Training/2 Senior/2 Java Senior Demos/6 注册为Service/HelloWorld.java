package com.yjw;

import javax.swing.JFrame;
import javax.swing.JLabel;

import org.tanukisoftware.wrapper.WrapperListener;
import org.tanukisoftware.wrapper.WrapperManager;


// 实现 WrapperListener 接口
public class HelloWorld implements WrapperListener {
  private static void createAndShowGUI {
      JFrame.setDefaultLookAndFeelDecorated(true);
    
      JFrame frame = new JFrame("HelloWorldSwring");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      JLabel label = new JLabel("Hello World");
      frame.getContentPane().add(label);
    
  }
}