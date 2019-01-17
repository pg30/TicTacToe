package tictactoe;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author IRONMAN
 */
public class details extends JFrame implements ActionListener
{
    String p1,p2,choose1;
    Font f = new Font("Arial",Font.BOLD,40);
    Container c;
    static JButton[] btn = new JButton[9];
    static JPanel p = new JPanel();
    details(String name1,String name2,String choose)
    {
        p1 = name1;p2=name2;choose1=choose;
        GridLayout g = new GridLayout(3,3);
        c = this.getContentPane();
        this.add(p);
        p.setLayout(g);
        for(int i=0;i<9;i++)
        {
            btn[i] = new JButton();
            btn[i].setText("");
            p.add(btn[i]);
            btn[i].addActionListener(this);
        }
    }
    String whoseTurn = "X";
    private void determineWhoseTurn()
    {
        if(whoseTurn.equals("X"))
            whoseTurn = "O";
        else
            whoseTurn = "X";
    }
    private boolean xWins()
    {
        String[] arr = new String[9];
        for(int i=0;i<9;i++)
               arr[i] = btn[i].getText();
        if(arr[0]=="X" && arr[1]=="X" && arr[2]=="X")
            return true;
        if(arr[3]=="X" && arr[4]=="X" && arr[5]=="X")
            return true;
        if(arr[6]=="X" && arr[7]=="X" && arr[8]=="X")
            return true;
        if(arr[0]=="X" && arr[3]=="X" && arr[6]=="X")
            return true;
        if(arr[1]=="X" && arr[4]=="X" && arr[7]=="X")
            return true;
        if(arr[2]=="X" && arr[5]=="X" && arr[8]=="X")
            return true;
        if(arr[0]=="X" && arr[4]=="X" && arr[8]=="X")
            return true;
        if(arr[2]=="X" && arr[4]=="X" && arr[6]=="X")
            return true;
        return false;
    }
    private boolean oWins()
    {
        String[] arr = new String[9];
        for(int i=0;i<9;i++)
               arr[i] = btn[i].getText();
        if(arr[0]=="O" && arr[1]=="O" && arr[2]=="O")
            return true;
        if(arr[3]=="O" && arr[4]=="O" && arr[5]=="O")
            return true;
        if(arr[6]=="O" && arr[7]=="O" && arr[8]=="O")
            return true;
        if(arr[0]=="O" && arr[3]=="O" && arr[6]=="O")
            return true;
        if(arr[1]=="O" && arr[4]=="O" && arr[7]=="O")
            return true;
        if(arr[2]=="O" && arr[5]=="O" && arr[8]=="O")
            return true;
        if(arr[0]=="O" && arr[4]=="O" && arr[8]=="O")
            return true;
        if(arr[2]=="O" && arr[4]=="O" && arr[6]=="O")
            return true;
        return false;
    }
    private boolean tie()
    {
        String[] arr = new String[9];
        for(int i=0;i<9;i++)
        {
               arr[i] = btn[i].getText();
               if(arr[i]=="")
                   return false;
        }
        return true;
    }
    private void reset()
    {
        for(int i=0;i<9;i++)
            btn[i].setText("");
        whoseTurn = "X";
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==btn[0])
        {
            btn[0].setFont(f);
            if(whoseTurn=="X")
                btn[0].setForeground(Color.red);
            else 
                btn[0].setForeground(Color.blue);
            btn[0].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[1])
        {
            btn[1].setFont(f);
            if(whoseTurn=="X")
                btn[1].setForeground(Color.red);
            else 
                btn[1].setForeground(Color.blue);
            btn[1].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[2])
        {
            btn[2].setFont(f);
            if(whoseTurn=="X")
                btn[2].setForeground(Color.red);
            else 
                btn[2].setForeground(Color.blue);
            btn[2].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[3])
        {
            btn[3].setFont(f);
            if(whoseTurn=="X")
                btn[3].setForeground(Color.red);
            else 
                btn[3].setForeground(Color.blue);
            btn[3].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[4])
        {
            btn[4].setFont(f);
            if(whoseTurn=="X")
                btn[4].setForeground(Color.red);
            else 
                btn[4].setForeground(Color.blue);
            btn[4].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[5])
        {
            btn[5].setFont(f);
            if(whoseTurn=="X")
                btn[5].setForeground(Color.red);
            else 
                btn[5].setForeground(Color.blue);
            btn[5].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[6])
        {
            btn[6].setFont(f);
            if(whoseTurn=="X")
                btn[6].setForeground(Color.red);
            else 
                btn[6].setForeground(Color.blue);
            btn[6].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[7])
        {
            btn[7].setFont(f);
            if(whoseTurn=="X")
                btn[7].setForeground(Color.red);
            else 
                btn[7].setForeground(Color.blue);
            btn[7].setText(whoseTurn);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
        if(e.getSource()==btn[8])
        {
            if(whoseTurn=="X")
                btn[8].setForeground(Color.red);
            else 
                btn[8].setForeground(Color.blue);
            btn[8].setText(whoseTurn);
            btn[8].setFont(f);
            determineWhoseTurn();
            if(xWins())
            {
              reset();
              if(choose1=="X")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(oWins())
            {
                reset();
                if(choose1=="O")
              {
                  JOptionPane.showMessageDialog(this,""+p1+" wins, Congratulations");
              }
              else
              {
                  JOptionPane.showMessageDialog(this,""+p2+" wins, Congratulations");
              }
            }
            else if(tie())
            {
                reset();
                JOptionPane.showMessageDialog(this,"It's a tie, Give it a another try");
            }
        }
    }
}
