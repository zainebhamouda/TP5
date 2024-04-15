/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
public class NeuralNetwork extends BaseModel {
    
    private int[] layers;
    private String activationFunction;

    public NeuralNetwork(int[] layers, String activationFunction, String name, int version, String description) {
        super(name, version, description);
        this.layers = layers;
        this.activationFunction = activationFunction;
    }

    public NeuralNetwork(String name, int[] layers, String activationFunction) {
        super(name, 1, "Neural Network");
        this.layers = layers;
        this.activationFunction = activationFunction;
    }

    @Override
    public void train(Dataset dataset) {
        
                System.out.println("surchargée pour implémenter l’entraînement du réseau de neurones.");

        
    }

    @Override
    public double predict(Dataset dataset) {
        
        return 0.0;
    }
    
    
    
}
