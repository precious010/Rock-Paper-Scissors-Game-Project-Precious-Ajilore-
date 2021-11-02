import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.JOptionPane;
import java.util.*;


class Main {
   
   static int wins = 0;
  static int comp_wins = 0;
  static int round_num = 1;

  private static JTextField choice;
  private static JButton rock;
  private static JButton paper;
  private static JButton scissors;
  private static JButton close;
  private static JTextField number_wins;
  private static JTextField pc_wins;
  private static JLabel roundsPlayed;



  public static void main(String[] args) {
    new Main();
  }

  public Main(){
     JFrame frame = new JFrame("Rock, Paper, Scissors");
    frame.setSize(500, 325);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);

    JLabel label = new JLabel("Hello world", SwingConstants.CENTER);
    frame.add(label);
   
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.setLayout(null);
     
    JButton exitButton = new JButton("Exit");
    exitButton.setBounds(200,200,100,50);
    exitButton.addActionListener(new Action());
    panel.add(exitButton);

    frame.setVisible(true);
  }

  public class Action implements ActionListener{
   public void actionPerformed (ActionEvent e){
     
     System.exit(0);
     //if (e.getSource()== exitButton){
      // frame.close();
     //}

   }

  }
}