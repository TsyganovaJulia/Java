package myjava.npp.homework.april2614_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.*;
import java.nio.file.FileAlreadyExistsException;


/**
 * Created by Samsung on 16.05.14.
 */
public class Position {
    public Position(){}

    public static int FindPosition (String word) throws FileAlreadyExistsException, IOException{

       BufferedReader reader = new BufferedReader( new InputStreamReader( new FileInputStream("input.txt")));
        boolean b = false;
        int[] mas = new int [10];
        int c;
        c = reader.read();
        int i, j=0, n=0;
        while (c != -1) {
            i=0;

            char s = (char)c;
            char k = word.charAt(i);
            if(s==k){
                i++;
                b=true;
                while((i<word.length())&& (b == true)){
                    k=word.charAt(i);
                    c=reader.read();j++;
                    s = (char) c;
                    if (s == k)
                        i++;

                    else
                        b=false;


                }
            }
                if (b ==true){
                    System.out.println(j + " ");
                    mas[n]=j; n++;

                    b=false;
                }
                else{
                    for(int l=0; l<i; l++){
                        c=reader.read();j++;
                    }
                }
            c = reader.read();j++;


        }
        return  mas[0];

    }




}
