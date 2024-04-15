/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
public class SupportVectorMachine extends BaseModel {
    
    private int iterations;
    private double learningRate;

    public SupportVectorMachine(int iterations, double learningRate, String name, int version, String description) {
        super(name, version, description);
        this.iterations = iterations;
        this.learningRate = learningRate;
    }

    public SupportVectorMachine(String name, int iterations, double learningRate) {
       super(name, 1, "Support Vector Machine");
       this.iterations = iterations;
       this.learningRate = learningRate;
}
    @Override
    public void train(Dataset dataset) {
        
        System.out.println("surchargée pour implémenter l’entraînement de la régression linéaire.");
    }

    @Override
    public double predict(Dataset dataset) {
        
        return 0.0;
    }
    
}
