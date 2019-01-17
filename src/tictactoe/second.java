package tictactoe;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class second extends JFrame implements ActionListener 
{
    JButton play1;
    JTextField p1;
    JTextField p2;
    JLabel player1;
    JLabel player2;
    JLabel choice;
    JLabel info;
    JRadioButton turn1;
    JRadioButton turn2;
    ButtonGroup bg;
    second()
    {
        JPanel p = new JPanel();
        p.setLayout(null);
        Container c = this.getContentPane();
        c.add(p);
        JLabel player1 = new JLabel("player1 :");
        JLabel player2 = new JLabel("player2 :");
        player1.setBounds(50,50,100,20);
        player2.setBounds(50,90,100,20);
        p.add(player1);
        p.add(player2);
        p1 = new JTextField();
        p2 = new JTextField();
        p1.setBounds(150,50,100,20);
        p2.setBounds(150,100,100,20);
        p.add(p1);
        p.add(p2);
        choice = new JLabel("choice of player1 :");
        choice.setBounds(50,150,200,20);
        p.add(choice);
        turn1 = new JRadioButton("X");
        turn1.setBounds(170,150,60,20);
        turn1.setSelected(true);
        p.add(turn1);
        turn2 = new JRadioButton("O");
        turn2.setBounds(230,150,60,20);
        p.add(turn2);
        bg = new ButtonGroup();
        bg.add(turn1);
        bg.add(turn2);
        play1 = new JButton("PLAY");
        play1.setBounds(150,210,80,30);
        play1.addActionListener(this);
        p.add(play1);
        info = new JLabel();
        info.setBounds(100,170,150,40);
        info.setText("It's X's turn");
        p.add(info);
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String name1 = p1.getText();
        String name2 = p2.getText();
        String choose;
        if(turn1.isSelected())
            choose = "X";
        else
            choose = "O";
        /*if(choose=="X")
            info.setText("It's "+p1+"'s turn first");
        else
            info.setText("It's "+p2+"'s turn first");*/
        if(e.getSource()==play1)
        {
            details d = new details(name1,name2,choose);
            d.setVisible(true);
            d.setResizable(false);
            d.setTitle("Tic Tac Toe");
            d.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            d.setBounds(100,100,400,400);
            this.dispose();
        }
        
    }
}
