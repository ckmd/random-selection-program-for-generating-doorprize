/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doorprize;

import java.util.Random;

/**
 *
 * @author Rachmad
 */
public class Doorprize {
    public void Doorprize(){
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lotre lotre1 = new Lotre();
        int i = 0;
        String tmp = null;
        while(i < lotre1.data.size()){
            tmp = lotre1.Random();
            System.out.println(tmp);
            i++;
        }
        lotre1.Remove(lotre1.data.indexOf(tmp));
        System.out.println("round 2");
        i = 0;
        while(i < lotre1.data.size()){
            tmp = lotre1.Random();
            System.out.println(tmp);
            i++;
        }
        lotre1.Remove(lotre1.data.indexOf(tmp));
        System.out.println("round 3");
        i = 0;
        while(i < lotre1.data.size()){
            tmp = lotre1.Random();
            System.out.println(tmp);
            i++;
        }
    }    
}
