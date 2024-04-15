/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
public class RegressionDataset extends Dataset {
    
    private int numFeatures;
    private double[] targets;

    public RegressionDataset(int numFeatures, double[] targets, boolean isTrain, String path) {
        super(isTrain, path);
        this.numFeatures = numFeatures;
        this.targets = targets;
    }

    public RegressionDataset(String path,boolean isTrain){
    
        super(isTrain, path);
    }
    @Override
    public void load() {
        
        System.out.println("chargement des données");
        
    }
    
    @Override
    public void preprocess() {
        
        System.out.println("pretraitement specifique");

    }
    
}
