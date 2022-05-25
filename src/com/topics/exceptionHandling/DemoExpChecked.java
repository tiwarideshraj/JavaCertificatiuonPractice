package com.topics.exceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoExpChecked {

        public static void main(String[] args)
        {

            try {
                File file=new File("input.txt");

                BufferedReader br = new BufferedReader(new FileReader(file)) ;
                String content;
                while ((content=br.readLine())!=null)
                {
                    System.out.println(content);
                }
                br.close();

            }
            catch(IOException e) {
                System.out.println("file not found");

               // e.printStackTrace();
            }
        }
    }

