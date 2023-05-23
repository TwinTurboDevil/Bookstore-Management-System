/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookstore_project;

import java.io.Serializable;

/**
 *
 * @author SARK
 */
public class book_class implements Serializable {
   protected String book_name,author,price,stock;

    public book_class(String book_name, String author, String price, String stock) {
        this.book_name = book_name;
        this.author = author;
        this.price = price;
        this.stock = stock;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
}
