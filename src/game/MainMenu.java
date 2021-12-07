package game;

import city.cs.engine.UserView;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MainMenu extends JPanel implements ActionListener {
    JFrame jFrame;
    JButton button1;
    JButton button2;
    JButton button3;
    JPanel jPanel;
    int i;

    public MainMenu(){//GameLevel gameLevel) {
        jFrame =new JFrame("MAIN MENU");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLocationByPlatform(true);
        button1 = new JButton("PLAY");
        button1.setFocusable(false);
        this.add(button1);
        button2 = new JButton("SAVE");
        button2.setFocusable(false);
        this.add(button2);
        button3 = new JButton("QUIT");
        button3.setFocusable(false);
        this.add(button3);
        int i=0;
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        jFrame.setResizable(false);
        jFrame.add(button1,BorderLayout.NORTH);
        jFrame.add(button2,BorderLayout.CENTER);
        jFrame.add(button3,BorderLayout.SOUTH);
        jFrame.pack();
        jFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        i++;
        if (e.getSource() == button1){
            System.out.println("PLAY PRESSED");
            if (i>1){

            }else{
                new Game();
            }

        }else if (e.getSource() == button2){
            System.out.println("SAVE PRESSED");
//            SavingData savingData =  new SavingData("data/scores.txt",game.world);
//            try {
//                savingData.saveGame(game);
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
        }else if (e.getSource() == button3){
            System.out.println("QUIT PRESSED");
            System.exit(0);
        }

    }
}
