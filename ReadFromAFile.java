package com.adobe.marketing.mobile.training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromAFile{
    BufferedReader reader = null;
    int total = 0;
    ReadFromAFile(){

        try {
            reader = new BufferedReader(new FileReader("//Users//tsamband//thiru//training//java//src//com//adobe//marketing//mobile//training//testdata.txt"));
            String line = null;
            while((line = reader.readLine()) != null) total += Integer.valueOf(line);
            System.out.println(" ReadingFromAFile : Total = " + total);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            try{
                if(reader != null) reader.close();
            } catch (IOException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
        }
    }

