/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools.Savers;

import entity.Book;
import entity.User;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jegor Bakunin
 */
public class UserSaver {
    private String fileName = "Users";
    
    public void saveUsers(User[] users) {
        FileOutputStream fos  = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(users);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода, вывода!");
        }
    }

    public User[] loadFile(User[] users) {
        FileInputStream fis  = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            return (User[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода или вывода!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Класс не найден!");
        }
        return new User[100];
        
    }
    
}
