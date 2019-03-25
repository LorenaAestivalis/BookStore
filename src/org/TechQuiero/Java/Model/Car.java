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
public class Car {
    private ArrayList<Book> books = new ArrayList<Book>();
    private Double price;

    public Car() {
        
    }

    
    public ArrayList<Book> getLibros() {
        return books;
    }

    public void setLibros(ArrayList<Book> libros) {
        this.books = libros;
    }

    public Double getPrecio() {
        return price;
    }

    public void setPrecio(Double precio) {
        this.price = precio;
    }
    
}
