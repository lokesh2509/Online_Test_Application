package com.company;

//import required classes and packages
import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;

//create NewPage class to create a new page on which user will navigate
class NewPage extends JFrame
{
    //constructor
    NewPage()
    {
        setDefaultCloseOperation(javax.swing.
                WindowConstants.DISPOSE_ON_CLOSE);
        Frame f = new Frame("Online Exam");

        Button b=new Button("I am ready to begin");

        b.setBounds(50,100,100,30);
        b.addActionListener(new ActionListener() {
            public void actionPerformed (ActionEvent e) {
                new OnlineTest("Online Test App");
            }
        });
// adding button the frame
        f.add(b);

// setting size, layout and visibility
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
}
