package myjava.npp.homework.april2614_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;


/**
 * Created by Samsung on 15.05.14.
 */
import java.util.Scanner;
public class Programm {
    public static void main(String[] args) throws IOException  {
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word");
        word = scan.next();
        try{
        Position.FindPosition( word );
            }
        catch (FileAlreadyExistsException e) {
            e.printStackTrace();}
    }
}











