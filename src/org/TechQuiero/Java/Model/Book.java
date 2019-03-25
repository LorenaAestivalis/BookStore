/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.TechQuiero.Java.Model;

/**
 *
 * @author claudia11
 */
public class Book {
    
    private String name;
    
    private Double price;
    private String author;

    public Book(String name, Double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }
    public Book(){}
    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return price;
    }

    public void setPrecio(Double price) {
        this.price = price;
    }

    public String getAutor() {
        return author;
    }

    public void setAutor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" + "name=" + name + ", price=" + price + ", autor=" + author + '}';
    }
    
    
}
