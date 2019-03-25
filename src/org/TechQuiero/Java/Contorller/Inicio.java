/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TechQuiero.Java.Contorller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.TechQuiero.Java.Model.Book;
import org.TechQuiero.Java.View.Home;

/**
 *
 * @author claudia11
 */
public class Inicio implements ActionListener {

    public String word = "";
    public Home h = new Home();
    public Book book = new Book();

    public void create() {
       
        h.bAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                word = h.wordBox.getText();
                System.err.println("word:"+word);
                System.err.println(h.TypeOfWord.getSelectedIndex());
                System.err.println(h.wordBox.getText());
            }
        });

        
    }
    


    public String biggining() {
        h.setTitle("");
        h.pack();
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        h.setLocationRelativeTo(null);
        h.setVisible(true);
         word = h.wordBox.getText();
                System.err.println("word1:"+word);
                return word;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
   
    }

}
