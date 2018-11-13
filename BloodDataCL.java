/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author mw0864694
 */
public class BloodDataCL {
    String bloodType = "O";
    char rHFactor = '+';  
    
    public void setrhFactor (char factor){
        rHFactor = factor;
    }
    
    public void setBloodType(String type){
        bloodType = type;
    }
    
    public String getBloodType(){
        return bloodType;
    }
    
    public char getrhFactor(){
        return rHFactor;
    } 
    BloodDataCL(){
    bloodType = "O";
    rHFactor = '+';   
    }
    
    BloodDataCL(String thing, char thingy){
    bloodType = thing;
    rHFactor = thingy; 
    }
}
