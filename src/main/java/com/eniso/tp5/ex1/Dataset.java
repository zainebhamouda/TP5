/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
abstract class Dataset {
    protected boolean isTrain;
    protected String path;

    public Dataset(boolean isTrain, String path) {
        this.isTrain = isTrain;
        this.path = path;
    }
    
    public abstract void load();
    public abstract void preprocess();
    
}
