/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
public class RandomForset extends BaseModel{
    
    private int numTrees;
    private int maxDepth;

    public RandomForset(int numTrees, int maxDepth, String name, int version, String description) {
        super(name, version, description);
        this.numTrees = numTrees;
        this.maxDepth = maxDepth;
    }

    public RandomForset(String name, int numTrees, int maxDepth) {
        super(name, 1, "Random Forest");
        this.numTrees = numTrees;
        this.maxDepth = maxDepth;
}
    @Override
    public void train(Dataset dataset) {
       
        System.out.println("surchargée pour implémenter l’entraînement de la forêt aléatoire.");
        
    }

    @Override
    public double predict(Dataset dataset) {
      
        return 0.0;
    }
    
}
