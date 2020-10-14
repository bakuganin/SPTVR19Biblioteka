/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.library.Secure;

import entity.Reader;
import entity.User;
import java.util.Scanner;
import entity.Reader;
import tools.Managers.ReaderManager;

/**
 *
 * @author user
 */
public class UserManager {
    public  User getAuthUser(User[] users){
        //получить от польхователя логин
        //получить от пользователя пароль
        //пройти по users циклом сравнить логин
        // --если логины совпадают
        // --сравнить их пароли
        // ---- если пароли совпадают то вернуть авторизованного пользователя и выйти из цикла
        //  --если пароли не совпадают попатыки 3 дать
        
        return null;
    }
    public void regUser() {
        ReaderManager readerManager =  new ReaderManager();
        Reader reader = readerManager.addReader(reader, readers);
        createUser(reader);
        return null;
    }
    private User createUser(Reader reader){
        User user = new User();
        Scanner input = new Scanner(System.in);
        System.out.print("Введите логин: ");
        user.setLogin(input.nextLine());
        System.out.print("Введите пароль: ");
        user.setPassword(input.nextLine());
        System.out.print("Введите телефон: ");
        user.setReader(input.nextLine());
        System.out.println("\u001B[0mДобавлен пользователь:\u001B[32m " + read.getName() + " " + read.getSurname());
        return user;
    }
    
    User getAuthUser() {
        
        return null;
    }
    
}
