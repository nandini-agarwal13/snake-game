/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package snakegame;

import java.awt.Color;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author nandi
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Snake Game");
        frame.setBounds(10,10,905,700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        GamePanel panel=new GamePanel();
        panel.setBackground(Color.BLACK);
        frame.add(panel);
        frame.setVisible(true);
        
    }
}
