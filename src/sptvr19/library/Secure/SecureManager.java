/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19.library.Secure;

import entity.User;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class SecureManager {
    private Scanner input = new Scanner(System.in);
    
    public void checkTask() {
        int numTask = -1;
        do{
            System.out.println("Задачи: ");
            System.out.println("0. Выход из программы");
            System.out.println("1. Регистрация");
            System.out.println("2. Вход в систему");
            System.out.println("Выберите задачу: ");
            String task = input.nextLine();
            UserManager userManager = new UserManager();
            try{
                numTask = Integer.parseInt(task);
                if (numTask >= 0 && numTask < 3) {
                    if(numTask == 0) {
                        System.out.println("Пока! :");
                        System.exit(0);
                    } else if(numTask == 1){
                        return serManager.regUser();
                    } else if (numTask == 2) {
                        return userManager.getAuthUser();
                        
                    }
                }
                break;
            } 
            catch (Exception e) {
                System.out.println("Нет такой задачи!\nВыберите из перечисленных!");
            }
        }while(true); 
        return null;
        
    } 
    
}
