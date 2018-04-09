/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doorprize;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Rachmad
 */
public class Lotre{
    ArrayList<String> data = new ArrayList<String>();    
    public Lotre(){
        int maks = 110, i = 100;
        while(i < maks){
            data.add(""+i);
            i++;
        }
        data.add("Guskoro");
        data.add("Rachmad");
        data.add("Andy");
        data.add("Pak Dwiki");
        data.add("Pak Isbat");
        data.add("Pak Arif");
        data.add("Fahim");
        data.add("Alfi");
    }
    public String Random(){
        String hasil = data.get(new Random().nextInt(data.size()));
        return hasil;
    }
    public void Remove(int i){
        data.remove(i);
    }
}
