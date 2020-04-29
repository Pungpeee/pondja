    package DetailsOfBooked;

import Hotel.Status;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Keycard {
    private Status status;

    public Keycard() {
    }
    
    public void StatusOfKeycard(){
        if(status.equals(status.BOOKED)){
            System.out.println(KeycardStatus.STAY);
        }else{
            System.out.println(KeycardStatus.LEAVE);
        }
    }
    public static void FileWriter() {
        try{
        FileWriter w = new FileWriter("keycard.txt");
        w.write("This is your Keycard.");
        w.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void FileReader() {
        try{
            FileReader r = new FileReader("keycard.txt");
            
        }catch(IOException e){
            
        }
        
    }
    
}
