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
public class Patient {
    int idNum;
    int age;
    BloodDataCL pbd = new BloodDataCL();
    public int getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    private void setIdNum(int id) {
        idNum = id;
    }

    private void setAge(int age) {
        this.age = age;
    }
    
    Patient(){
        idNum = 0;
        age = 0;
        pbd.bloodType = "O";
        pbd.rHFactor = '+';
        
    }
    Patient (int id, int age, String bType, char thing){
        idNum= id;
        this.age = age;
        pbd.bloodType = bType;
        pbd.rHFactor = thing;
        
        
    }
    
    public void printPatient(){
        System.out.printf(" id: %s\n age: %s\n Blood Type: %s\n RH Factor: %s",idNum,age,pbd.bloodType,pbd.rHFactor);
    }
}
