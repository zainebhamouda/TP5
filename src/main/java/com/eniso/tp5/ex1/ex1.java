/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.eniso.tp5.ex1;

/**
 *
 * @author zaine
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClassificationDataset classificationData = new ClassificationDataset("chemin/vers/classification_data.csv", true);
        RegressionDataset regressionData = new RegressionDataset("chemin/vers/regression_data.csv", false);

        SupportVectorMachine svm = new SupportVectorMachine("SVM", 1, 0.01);
        svm.train(classificationData);
        svm.displayDetails();
        RandomForset rf = new RandomForset("RandomForest", 100, 10);
        rf.train(regressionData);
        rf.displayDetails();
        NeuralNetwork nn = new NeuralNetwork("NeuralNetwork", new int[]{10, 5, 1}, "sigmoid");
        nn.train(classificationData);
        nn.displayDetails();
        System.out.println("Prédiction SVM : " + svm.predict(classificationData));
        System.out.println("Prédiction RandomForest : " + rf.predict(regressionData));
        System.out.println("Prédiction NeuralNetwork : " + nn.predict(classificationData));
    }
    
}
