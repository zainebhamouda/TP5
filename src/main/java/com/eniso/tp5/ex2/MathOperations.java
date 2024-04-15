/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex2;

/**
 *
 * @author zaine
 */
public class MathOperations {
    
        public void calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Nombre négatif passé : " + n);
        }
        long fact=1;
        for (int i = 1; i <= n; i++){
        
            fact*= i;
        }
        System.out.println("Le factoriel de " +n+ " est : " + fact);
        }
        public void calculateSquareRoot(int n){
            
            if (n<0){
            
              throw new ArithmeticException("on ne peut pas fait le racine carré d'un nombre négatif");
            
            }
            double racine=Math.sqrt(n);
            System.out.println("Racine carrée de "+n+"egale:"+racine);
        
        
        }
    
}
