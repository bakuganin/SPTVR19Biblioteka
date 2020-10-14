/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */
public class ReadFactory {

    public Reader createReader() {
        Scanner input = new Scanner(System.in);
        Reader read = new Reader();
        System.out.print("Введите имя: ");
        read.setName(input.nextLine());
        System.out.print("Введите фамилию: ");
        read.setSurname(input.nextLine());
        System.out.print("Введите телефон: ");
        read.setNumPhone(input.nextLine());
        System.out.println("\u001B[0mДобавлен пользователь:\u001B[32m " + read.getName() + " " + read.getSurname());
        return read;
    } 
    
}
