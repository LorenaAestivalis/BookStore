/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TechQuiero.Java.Model;

import java.util.ArrayList;

/**
 *
 * @author claudia11
 */
public class Books {
    ArrayList<Book> Books = new ArrayList<Book>();

    public Books(){}
    public ArrayList<Book> getLibros() {
        return Books;
    }

    public void setLibros(ArrayList<Book> Libros) {
        this.Books = Libros;
    }

    @Override
    public String toString() {
        return "Library " + "Books: " + Books + ' ';
    }
    
    
}
