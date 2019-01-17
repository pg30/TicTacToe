/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author PRANAY
 */
public class first extends JFrame implements ActionListener
{
    first()
    {
        JPanel p = new JPanel();
        p.setLayout(null);
        Container c = this.getContentPane();
        c.add(p);
        p.setBackground(Color.WHITE);
        ImageIcon icon = new ImageIcon(this.getClass().getResource("/images/download.jpg"));
        JLabel label = new JLabel(icon);
        label.setBounds(150,0,icon.getIconWidth(),icon.getIconHeight());
        p.add(label);
        JLabel lb = new JLabel();
        Font f = new Font(Font.SANS_SERIF,Font.BOLD,30);
        lb.setText("Tic-Tac-Toe");
        lb.setFont(f);
        lb.setBounds(155,180,200,30);
        lb.setForeground(Color.BLACK);
        p.add(lb);
        JButton play = new JButton("PLAY");
        play.setBounds(190,300,100,30);
        play.addActionListener(this);
        p.add(play);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        second s = new second();
        s.setVisible(true);
        s.setResizable(false);
        s.setTitle("Tic Tac Toe");
        s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        s.setBounds(100,100,400,400);
        this.dispose();
    }
}
