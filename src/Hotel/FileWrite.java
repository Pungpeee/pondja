
package Hotel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import Hotel.Guest;
import java.io.BufferedReader;
import java.util.Scanner;



public class FileWrite {
    public static void main(String[] args) {
        
    }
   
    public static void FileWriter(String firstname,String surname) {
        
        Scanner keyboard = new Scanner(System.in);
        try{
        FileWriter w = new FileWriter("keycard.txt");
        PrintWriter p = new PrintWriter(w);
        
        p.println("---This is your Keycard---");
        firstname = keyboard.nextLine();
        p.println("Name: "+firstname+"Surname: "+surname);
        surname = keyboard.nextLine();
        
        p.close();
        
        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }
//    public static void FileReader() {
//        try{
//            FileReader r = new FileReader("keycard.txt");
//            
//        }catch(IOException e){
//            
//        }
//        
//    }
}
