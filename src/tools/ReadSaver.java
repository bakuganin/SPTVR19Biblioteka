/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import entity.Book;
import entity.Read;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Jegor Bakunin
 */
public class ReadSaver {
    private String fileName = "readers";
    
   public void saveReaders(Read[] readers) {
        FileOutputStream fos  = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(readers);
            oos.flush();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода, вывода!");
        }
    }

    public Read[] loadFile(Read[] readers) {
        FileInputStream fis  = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            return (Read[]) ois.readObject();
        } catch (FileNotFoundException ex) {
            System.out.println("Файл не найден!");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода или вывода!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Класс не найден!");
        }
        return new Read[100];
        
    }
    
}