/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TechQuiero.Java.Contorller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import org.TechQuiero.Java.Model.Book;

/**
 *
 * @author claudia11
 */
public class ReaderOfFiles {

    
    ReaderOfFiles() {
    }

    public ArrayList  read(ArrayList books) {

        File file = null;
        FileReader fr = null;
        BufferedReader bufferedReader = null;

        try {
            for (int i = 1; i <= 10; i++) {
                
                file = null;
                file = new File("C:\\Users\\claudia11\\Documents\\2019\\cursoJAvaConnectory\\bo\\" + i + ".txt");
                fr = new FileReader(file);
                Book book = new Book("", 0.0, "");
                bufferedReader = new BufferedReader(fr);
                String linea = "";
                String nombre = "";
                String autor = "";
                Double a = 0.0;

                try {
                    int j = 0;
                    while ((linea = bufferedReader.readLine()) != null) {
                        j++;

                        if (j == 1) {
                            nombre = linea;
                        }
                        if (j == 2) {
                            autor = linea;
                        }
                        if (j == 3) {
                            String b = linea;
                            a = Double.parseDouble(linea);
                        }//if
                    }//while
                    book.setNombre(nombre);
                    book.setAutor(autor);
                    book.setPrecio(a);
                    books.add(book);
                } catch (IOException e) {
                    e.printStackTrace();
                }//catch
            }//for
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }//catch

 return books;
    }
}
