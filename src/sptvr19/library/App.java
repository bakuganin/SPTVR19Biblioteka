/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.library;

import entity.Book;
import entity.Read;
import java.util.Scanner;
import tools.BookFactory;
import tools.ReadFactory;

/**
 *
 * @author user
 */
class App {
    private Book[] books = new Book[2];
    private Read[] readers = new Read[10];
    public void run() {
        int amountBook = -1;
        int amountReaders = -1;
        boolean repeat = true;
        System.out.println("<--- Библиотека --->");
        do {
            System.out.println("\u001B[35mСписок задач:");
            System.out.println("\u001B[36m(\u001B[35m0\u001B[36m) - Выйти из библиотеки");
            System.out.println("\u001B[36m(\u001B[35m1\u001B[36m) - Добавить новую книгу");
            System.out.println("\u001B[36m(\u001B[35m2\u001B[36m) - Посмотреть список книг");
            System.out.println("\u001B[36m(\u001B[35m3\u001B[36m) - Зарегестрировать пользователя");
            System.out.println("\u001B[36m(\u001B[35m4\u001B[36m) - Вывести списко читателей");
            System.out.println("\u001B[36m(\u001B[35m5\u001B[36m) - Выдать книгу читателю");
            System.out.println("\u001B[36m(\u001B[35m6\u001B[36m) - Вернуть книгу в библиотеку");
            System.out.println("\u001B[35mВыберите задачу:\u001B[32m");
            Scanner input = new Scanner(System.in);
            String task = input.nextLine();
            switch (task) {
                case "0":
                    System.out.println("<--- Выход из программы --->");
                    repeat = false;
                    break;
                case "1":
                    System.out.println("<--- Добавить новую книгу --->");
                    amountBook = amountBook + 1;
                    if (amountBook != 2 || amountBook < 2){
                        Book book;          
                        BookFactory bookFactory = new BookFactory();
                        book = bookFactory.createBook();
                        books[amountBook] = book;
                    }
                    else{
                        System.out.println("\u001B[33mВ библиотеке закончилось место.\u001B[0m");
                    }
                    break;

                case "2":
                    System.out.println("<--- Cписок книг --->");
                    for (int i = 0; i < books.length; i++){
                        if(books[i] != null){
                            System.out.printf("\u001B[36m%3d\u001B[35m. \u001B[0mНазвание книги:\u001B[32m %s%n\u001B[0m     Автор:\u001B[32m %s%n"
                                    ,i+1
                                    ,books[i].getName()
                                    ,books[i].getAuthor());
                        }
                    }
                    break;

                case "3":
                    System.out.println("<--- Зарегестрировать пользователя --->");
                    amountReaders += 1;
                    Read read;
                    ReadFactory readFactory = new ReadFactory();
                    read = readFactory.createReader();
                    readers[amountReaders] = read;
                    break;
                
                case "4":
                    System.out.println("<--- Список пользователей --->");
                    for (int i = 0; i < readers.length; i++){
                        if(readers[i] != null){
                            System.out.printf("\u001B[36m%3d\u001B[35m. \u001B[0mЧитатель: \u001B[32m%s %s%n", i+1, readers[i].getName(), readers[i].getSurname());
                        }
                    }
                    break;
                    
                case "5":
                    System.out.println("<--- Выдача книги --->");
                    break;

                case "6":
                    System.out.println("<--- Вернуть книгу в библиотеку --->");
                    break;

                default:
                    System.out.println("<--- Такой задачи нет! --->");
            }
        }while(repeat);
    }
    
}
