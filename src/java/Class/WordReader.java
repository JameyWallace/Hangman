/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author c0638820
 */
public class WordReader {
    private static final String fileName = "";
    
    private ArrayList<String> words = new ArrayList<String>();
    public WordReader(){
    try (InputStream in = getClass().getResourceAsStream(fileName);
        BufferedReader bf = new BufferedReader(new InputStreamReader(in))) {
        
        String line = "";
        while ((line = bf.readLine()) != null)
            //word.add(line);
            return ;
        }
    
        catch (Exception e){
                System.out.println("Didn't find/read file:" + fileName);
                System.out.println("Error Message:" + e.getMessage());
            }
        }
    //Call to Database
//    public String getRandomWord(){
//        if(word.isEmpty()) return "No Data";
//        return word.get((int)(Math.random()word.size()));
//    }
}