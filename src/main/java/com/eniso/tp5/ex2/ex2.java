/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.eniso.tp5.ex2;

import java.io.FileNotFoundException;

/**
 *
 * @author zaine
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FileManager fileManager = new FileManager();
        MathOperations mathOperations = new MathOperations();
        UserValidator userValidator = new UserValidator();
        try {
        fileManager.readFile("invalid/file/path.txt");
        } catch (FileNotFoundException e) {
        System.out.println("Exception attrapée : " + e.getMessage());
        }
        try {
        mathOperations.calculateFactorial(-5);
        } catch (IllegalArgumentException e) {
        System.out.println("Exception attrapée : " + e.getMessage());
        }
        try {
        mathOperations.calculateSquareRoot(-10);
        } catch (ArithmeticException e) {
        System.out.println("Exception attrapée : " + e.getMessage());
        }
        try {
        userValidator.validateAge(16);
        } catch (UserAgeException e) {
        System.out.println("Exception attrapée : " + e.getMessage());
        }
    }
    
}
