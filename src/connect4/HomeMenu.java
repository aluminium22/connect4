/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect4;
/**
 *
 * @author Rob
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class HomeMenu implements ActionListener {
    JTextField jtf1, jtf2;
    JButton jbtnRev, jbtnRev2;
    JLabel jlabPrompt, jlabPlayer1, jlabPlayer2;
    String player1, player2;
    HomeMenu() {
        JFrame jfrm = new JFrame("Use a TextField");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(250, 300);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jtf1 = new JTextField(10);
        jtf1.setActionCommand("myTF");
        jbtnRev = new JButton("Player 1");
        jtf1.addActionListener(this);
        jbtnRev.addActionListener(this);
        jlabPrompt = new JLabel(" ");
        System.out.println(jlabPlayer1);
        jlabPlayer1 = new JLabel("Player 1, What's your name?");
        jtf2 = new JTextField(10);
        jtf2.setActionCommand("myTF");
        jbtnRev2 = new JButton("Player 2");
        jtf2.addActionListener(this);
        jbtnRev2.addActionListener(this);
        jtf2 = new JTextField(10);
        jlabPrompt = new JLabel("");
        System.out.println(jlabPlayer2);
        jlabPlayer2 = new JLabel("Player 2, What's your name?");
        jfrm.add(jlabPrompt);
        jfrm.add(jtf1);
        jfrm.add(jbtnRev);  
        jfrm.add(jlabPlayer1);
        jfrm.add(jtf2);
        jfrm.add(jbtnRev2);  
        jfrm.add(jlabPlayer2);
        jfrm.setVisible(true);        
    }
    public void actionPerformed(ActionEvent ae) {
        if(ae.getActionCommand().equals("Player 1")) {
            jlabPlayer1.setText("Player 1's name is: " + jtf1.getText());
            player1 = jtf1.getText();
        } 
        if(ae.getActionCommand().equals("Player 2")) {
            jlabPlayer2.setText("Player 2's name is: " + jtf2.getText());
            player2 = jtf2.getText();
        }  
    }
    public static void PlayerNames(String args[]) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                new HomeMenu();
            }
        });
        Connect4 mygame = new Connect4();
        mygame.display();
    }
}
