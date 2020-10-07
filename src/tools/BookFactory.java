/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class BookFactory {

    public Book createBook() {
        Scanner input = new Scanner(System.in);
        Book book = new Book();
        System.out.print("Введите название кники: ");
        book.setName(input.nextLine());
        System.out.print("Введите Автора: ");
        book.setAuthor(input.nextLine());
        System.out.print("Введите год издание книги: ");
        book.setPublishedYear(input.nextInt());
        System.out.println("\u001B[0mДобавлена книга:\u001B[32m " + book.getName());
        return book;

    }
    
}
