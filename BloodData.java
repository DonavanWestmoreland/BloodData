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
public class BloodData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BloodDataCL tbd = new BloodDataCL();
        System.out.println("Show the default has been initialized:");
        System.out.println("Default Blood Type: " + tbd.getBloodType());
        System.out.println("Default RH Type: " + tbd.getrhFactor());
        System.out.println("********************");
        System.out.println("Second Test: change the fields");      
        tbd.setBloodType("A");
        tbd.setrhFactor('-');
        System.out.println("New Blood Type: " + tbd.getBloodType());
        System.out.println("New RH Type: " + tbd.getrhFactor());
        System.out.println("**************");
        System.out.println("Third Test: Use overloaded constructor");
        BloodDataCL tbd2 = new BloodDataCL("A",'+');
        System.out.printf("Blood type: %s\nRHFactor: %s", tbd2.getBloodType(),tbd2.getrhFactor());
        
        Patient pat = new Patient(0,12,"B",'-');
        
        pat.printPatient();
    }
    
}
