/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TechQuiero.Java.Contorller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import org.TechQuiero.Java.View.Home;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.TechQuiero.Java.Model.*;
import org.TechQuiero.Java.View.*;

public class Store {

    public static Double total = 0.0;
    public static Integer cantidad = 0;
    public static Book book = new Book();
    public static Books books = new Books();
    public static ArrayList<Book> bookss = new ArrayList<Book>();
    public static Home h = new Home();
    public static ArrayList<Book> car = new ArrayList<Book>();

    public static void main(String[] args) {

        read1();

        Inicio2();
    }

    public static void viewMenu() {
        Menu menu = new Menu();
        menu.setVisible(true);
        String name = "";
        String Author = "";
        Double price = 0.0;
        Object[] columns = {"Name", "Author", "Price"};
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        menu.jTable1.setModel(model);
        for (Book b : bookss) {
            Object[] row = new Object[3];
            row[0] = b.getNombre();
            row[1] = b.getAutor();
            row[2] = b.getPrecio();
            model.addRow(row);
        }

        menu.jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int resp=JOptionPane.showConfirmDialog(null, "¿Are you sure to add the book into your car?");
                if(resp==0){
                int i = menu.jTable1.getSelectedRow();
                String n = model.getValueAt(i, 0).toString();
                String a = model.getValueAt(i, 1).toString();
                Double p =Double.parseDouble(model.getValueAt(i, 2).toString());
                
                Book bk=new Book(n,p,a);
                cantidad++;
                car.add(bk);
                   
                    menu.setVisible(false);
                }
            }

        });

    }

    public static void viewDetailsbook(Book b) {
        ViewBook viewBook = new ViewBook();
        viewBook.setVisible(true);
        viewBook.details.setText("Name: " + b.getNombre() + "\n Author: " + b.getAutor() + "\n Price: " + b.getPrecio());
        viewBook.details.setEnabled(false);
        viewBook.buyBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int resp = JOptionPane.showConfirmDialog(null, "¿Are you sure?");
                try {
                    if (cantidad == 0) {
                        JOptionPane.showMessageDialog(null, "Your shopping cart is empty.");
                        return;
                    }

                    buy();
                } catch (IOException ex) {
                    Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        viewBook.addBook.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int resp = JOptionPane.showConfirmDialog(null, "¿Are you sure?");
                cantidad++;
                if (resp == 0) {
                    viewBook.BooksInMyCar.setText("" + cantidad);
                    car.add(b);
                }
            }

        });
        viewBook.backToHome.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Inicio2();
                viewBook.setVisible(false);
            }
        });
    }

    public static void buy() throws IOException {

        cantidad++;
        FileWriter file2 = null;
        PrintWriter desk = null;
        try {
            file2 = new FileWriter("C:\\Users\\claudia11\\Documents\\2019\\cursoJAvaConnectory\\bo\\invoice.txt");
            desk = new PrintWriter(file2);

            for (Book b : car) {
                desk.println(b.getNombre());
                desk.println(b.getAutor());
                desk.println(b.getPrecio());

                total = total + b.getPrecio();
                desk.println("\n \n ");
                desk.print("Number of items: " + cantidad + "    ");
                desk.print("Total: " + total + "    ");
                desk.println("\n \n ");
                JOptionPane.showMessageDialog(null, "Your purchase has been made successfully!\n The ticket was generated in this route:\n"
                        + "\"C:\\Users\\claudia11\\Documents\\2019\\cursoJAvaConnectory\\bo\\invoice.txt\"");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            file2.close();
        }

    }

    public static void Inicio2() {

        h.setVisible(true);
        h.cantidadBoooks.setText("" + cantidad);

        h.Librarybutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                viewMenu();
            }
        });
        h.buyBooksss.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                try {
                    buy();
                } catch (IOException ex) {
                    Logger.getLogger(Store.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        h.bAceptar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Search(h.wordBox.getText());
            }
        });

    }

    public static void read1() {
        ReaderOfFiles r = new ReaderOfFiles();
        bookss = r.read(bookss);//Listas de libro de una sola categoria
        books.setLibros(bookss);//Mi biblioteca(listas de categorias de libros)
    }

    public static void Search(String word) {
        Boolean bandera = false;
        word = word.toUpperCase();
        for (Book b : bookss) {
            if ((b.getNombre().toUpperCase().equals(word) || b.getAutor().toUpperCase().equals(word)) && bandera == false) {
                bandera = true;
                h.wordBox.setText("");
                h.setVisible(false);
                viewDetailsbook(b);
                return;
            }
        }
        if (!bandera) {
            JOptionPane.showMessageDialog(null, "Sorry, Book not found.");
            h.wordBox.setText("");
        }
    }

}
