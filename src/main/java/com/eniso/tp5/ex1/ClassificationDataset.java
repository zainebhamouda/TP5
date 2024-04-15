/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
public class ClassificationDataset extends Dataset{
    
    private String[] labels;
    private int numClasses;

    public ClassificationDataset(String[] labels, int numClasses, boolean isTrain, String path) {
        super(isTrain, path);
        this.labels = labels;
        this.numClasses = numClasses;
    }

    public ClassificationDataset(String path,boolean isTrain){
    
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
