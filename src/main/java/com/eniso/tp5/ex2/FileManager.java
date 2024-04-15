/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eniso.tp5.ex2;

import java.io.FileNotFoundException;

/**
 *
 * @author zaine
 */
public class FileManager {
    
        public void readFile(String filePath) throws FileNotFoundException {
        throw new FileNotFoundException("Fichier non trouvé : " + filePath);
    }
    
}
