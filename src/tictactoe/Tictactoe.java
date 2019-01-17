/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author PRANAY
 */
public class Tictactoe 
{
    public static void main(String[] args) 
    {
        first f = new first();
        f.setVisible(true);
        f.setTitle("Tic Tac Toe");
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,500);
    }
    
}
