/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package connect4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Rob
 */
class HomeMenu implements ActionListener {
    JLabel jlabPrompt, jlabContents;
     HomeMenu() {
        JFrame jfrm = new JFrame("Testing");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(275, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextField p1name = new JTextField(10);
        JTextField p2name = new JTextField(10);
        p1name.setActionCommand("P1 name");
        p2name.setActionCommand("p2 name");
        JButton Player1 = new JButton("Player 1");
        JButton Player2 = new JButton("Player 2");
        Player1.addActionListener(this);
        Player2.addActionListener(this);
        p1name.addActionListener(this);
        p1name.addActionListener(this);
        
        jfrm.add(Player1);
        jfrm.add(Player2);
        jfrm.add(p1name);
        jfrm.add(p2name);
        
        jlabPrompt = new JLabel("Players are...");
        jfrm.add(jlabPrompt);
        jfrm.setVisible(true);
    }
     public void actionPerformed(ActionEvent names) {
         if(names.getActionCommand().equals("Player 1"))
             jlabPrompt.setText(Connect4.name1);
         else
             jlabPrompt.setText(Connect4.name2);
     }
     public void setActionCommand(String cmd){
         
     }
     public static void MenuFrame(String args[]) {
         SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new HomeMenu();
            }
         });
     }
}
