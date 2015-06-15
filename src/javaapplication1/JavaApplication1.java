package javaapplication1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class JavaApplication1 {    
    
    public static void main(String[] args) throws IOException {  
        final String PACH_OF_FILE="file.txt";             
        BufferedReader reader = new BufferedReader(new FileReader(PACH_OF_FILE));
        TextAnalysis textAnalyzer=new TextAnalysis();
        System.out.println(new Date(System.currentTimeMillis())+"do");
        List<WordAndCount> frequencyTable=textAnalyzer.analyze(reader);         
        printResults(frequencyTable);
        System.out.println(new Date(System.currentTimeMillis())+"after");
    }

    private static void printResults(List<WordAndCount> frequencyTable) {        
       for(WordAndCount index : frequencyTable){
            System.out.println(index.getWord()+"  "+index.getCount()+"\n");
       }
    }
}
    

