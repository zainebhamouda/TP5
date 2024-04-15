/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
abstract class BaseModel implements MachineLearningModel {
    protected String name;
    private   int version ;
    private String description ;
    private String device ;

    public BaseModel(String name, int version, String description) {
        this.name = name;
        this.version = version;
        this.description = description;
    }
    
    public void displayDetails(){
    
        System.out.println("name: "+this.name+" version: "+this.version+" description:"+this.description+" device:"+this.device);
    
    }
    
}
