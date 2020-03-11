package com.soldier.work04;

import javax.swing.*;
import java.awt.*;
import java.io.*;

/**
 * @Author soldier
 * @Date 2020/3/11 21:41
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description:使用java中输入输出流技术读取work4.txt里边的内容并将内容显示在JFrame窗口
 */
public class ReadText extends JFrame {

    private JTextArea textAreaOutput;

    public ReadText() throws IOException {

        super("READTXT");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());
        textAreaOutput = new JTextArea("READTXT", 45, 80);
        textAreaOutput.setSelectedTextColor(Color.RED);
        // 激活自动换行功能
        textAreaOutput.setLineWrap(true);
        // 激活断行不断字功能
        textAreaOutput.setWrapStyleWord(true);
        // 解决乱码
        InputStreamReader isr = new InputStreamReader(new FileInputStream("E:/IDE_project/IdeaProjects/android-demo/src/com/soldier/work04/work4.txt"), "GBK");
        BufferedReader reader = new BufferedReader(isr);
        String str = reader.readLine();
        String end = "";
        while ((str != null)) {
            end += str + "\n";
            str = reader.readLine();
        }
        textAreaOutput.setText(end);

        getContentPane().add(textAreaOutput);
        setSize(512, 300);

    }
    public static void main(String[] args) throws IOException {
        ReadText readText = new ReadText();
        readText.setVisible(true);
    }
}
