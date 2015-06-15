package javaapplication1;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TextAnalysis {       
   
    public List<WordAndCount> analyze(BufferedReader reader) throws IOException{   
        String[] words=readWords(reader);                        
        return analyze(words);
    }
    
    private String[] readWords(BufferedReader reader) throws IOException {
       String line;       
       StringBuffer text = new StringBuffer();
       
       while ((line = reader.readLine()) != null) {            
          text.append(line); 
       }     
       
       return text.toString().split("[\\p{Punct}\\s]"); 
    }
 
    private List<WordAndCount> analyze(String[] words) {                   
        Map<String, WordAndCount> frequencyMap = new HashMap<>(); 
         
        for(String word : words){
            
            if (frequencyMap.containsKey(word)){
                WordAndCount wordAndCount = frequencyMap.get(word);
                wordAndCount.setCount(wordAndCount.getCount() + 1);
            }            
            else{
                frequencyMap.put(word,new WordAndCount(word, 1));   
            }         
        }
        List<WordAndCount> frequencyTable = new ArrayList<>(frequencyMap.values());
        
        Collections.sort(frequencyTable);    
        
        return frequencyTable;
    }    
}
