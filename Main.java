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
    
    ImageIcon icon = new ImageIcon("newrock.jpg");
    ImageIcon paperImg = new ImageIcon("papernew.jpg");
    ImageIcon sciImg = new ImageIcon("scissors.jpg");
   
    JPanel panel = new JPanel();
    frame.add(panel);
    panel.setLayout(null);

    JLabel label = new JLabel("Click on your choice!");
    label.setBounds(170, 40, 300, 25);
    panel.add(label);
     
    JButton exitButton = new JButton("Exit");
    exitButton.setBounds(240,240,80,50);
    exitButton.addActionListener(new Action());
    panel.add(exitButton);

    //////// ROCK BUTTON///////////
    rock = new JButton("Rock");
    rock.setBounds(40, 100, 125, 125);
    rock.addActionListener(new Action());
    rock.setIcon(icon);
    rock.setHorizontalTextPosition(JButton.CENTER);
    rock.setFocusable(false);

    panel.add(rock);

    /////// PAPER BUTTON///////////////
    paper = new JButton("Paper");
    paper.setIcon(paperImg);
    paper.setBounds(195, 100, 125, 125);
    paper.addActionListener(new Action());
    paper.setHorizontalTextPosition(JButton.CENTER);

    paper.setFocusable(false);

    panel.add(paper);

    /////// SCISSORS BUTTON////////////
    scissors = new JButton("Scissors");
    scissors.setIcon(sciImg);
    scissors.setBounds(350, 100, 125, 125);
    scissors.addActionListener(new Action());
    scissors.setOpaque(true);
    scissors.setFocusable(false);
    scissors.setHorizontalTextPosition(JButton.CENTER);

    panel.add(scissors);


    ////CLOSE BUTTON/////////
    close = new JButton ("Close");
    close.setBounds (350, 300, 100,25);
    close.addActionListener(new Action());
    close.setFocusable(false);
    panel.add(close);

    /// TO DISPLAY THE NUMBER OF TIMES THEY WON//.
    number_wins = new JTextField(" Your Wins: " + wins);
    number_wins.setBounds(10, 40, 90, 25);
    number_wins.setEditable(false);
    number_wins.setBorder(BorderFactory.createLineBorder(Color.orange));
    number_wins.setBackground(Color.WHITE);
    panel.add(number_wins);

    /// TO DISPLAY THE NUMBER OF TIMES THE COMPUTER WON///
    pc_wins = new JTextField(" Computer's Wins: " + comp_wins);
    pc_wins.setBounds(350, 40, 130, 25);
    pc_wins.setEditable(false);
    pc_wins.setBorder(BorderFactory.createLineBorder(Color.red));
    pc_wins.setBackground(Color.WHITE);
    panel.add(pc_wins);

    // choiceRock.setVisible(false);
    roundsPlayed = new JLabel(" Round: " + round_num);
    roundsPlayed.setBounds(190, 10, 85, 25);
    panel.add(roundsPlayed);

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