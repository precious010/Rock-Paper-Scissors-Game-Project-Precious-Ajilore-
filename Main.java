import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Main {



  public static void main(String[] args) {
    new Main();
  }

  public Main(){
     JFrame frame = new JFrame("Hello world");
    frame.setSize(300, 300);
    frame.setLocation(5, 5);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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