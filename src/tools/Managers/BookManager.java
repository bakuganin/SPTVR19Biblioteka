/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.Managers;

import entity.Book;
import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */
public class BookManager {
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

    public void addBook(Book book, Book[] books) {
        for(int i = 0; i < books.length; i++) {
            if (books[i] ==  null){
                books[i] = book;
                System.out.printf("\u001B[0mДобавлена книга: \u001B[32m%s%n", books[i].getName());
                break;
            }
        }
        if (books[99] != null){
            System.out.println("\u001B[33mВ библиотеке закончилось место.\u001B[0m");
        }
    }

    public void printBooksList(Book[] books) {
        for (int i = 0; i < books.length; i++){
                        if(books[i] != null){
                            System.out.printf("\u001B[36m%3d\u001B[35m. \u001B[0mНазвание книги:\u001B[32m %s%n\u001B[0m     Автор:\u001B[32m %s%n"
                                    ,i+1
                                    ,books[i].getName()
                                    ,books[i].getAuthor());
                        }
                    }
    }
}
