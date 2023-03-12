import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.WindowConstants;

public class App extends JFrame{
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
    public void initialize(){
        JLabel l2= new JLabel();
        JLayeredPane pane=getLayeredPane();
        ImageIcon i= new ImageIcon("media/tic tac toe.jpg");
        l2= new JLabel(i);
        l2.setBounds(0,0,1000,1000);
        l2.setVisible(true);
        
        
        JLabel intro=new JLabel("Welcome to Tic Tac Toe");
        intro.setFont(mainFont);
                // LABEL PANEL
        JPanel labels=new JPanel();
        labels.setLayout(new GridLayout(1, 2, 10, 0));
        labels.setBorder(BorderFactory.createEmptyBorder(30, 140, 30, 50));
        labels.add(intro);
        labels.setOpaque(false);
        
        
        


        JButton start=new JButton("Start the game");
        start.setFont(mainFont);
        start.setFocusable(false);
        start.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                TTT1 ttt=new TTT1();
                dispose();
            }
            
        });
                //  BUTTONS PANEL
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 10, 0));
        buttonsPanel.setBorder(BorderFactory.createEmptyBorder(30, 150, 100, 150));
        buttonsPanel.add(start);
        
      
        add(l2);
        add(buttonsPanel, BorderLayout.SOUTH);
        add(labels, BorderLayout.NORTH);
        setTitle("Tic Tac Toe");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setMinimumSize(new Dimension(350, 450));
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        App a=new App();
        a.initialize();
    }
}

