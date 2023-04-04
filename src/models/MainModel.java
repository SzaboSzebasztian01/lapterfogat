/*
 * File:.MainModel.java
 * Author:Szabó Szebasztián
 * Copyright:2023, Szebi:)
 * Group:SZOFT-I-1-N
 * Date:2023-04-04
 * Github: https://github.com/SzaboSzebasztian01
 * Licenc: GNU GPL
 */

package models;

public class MainModel {
    public double calcVolume(double sideA, double diagonal){
        double volume = Math.pow(diagonal, 3) / Math.sqrt(8);
        return volume;
        
    }
    
}
