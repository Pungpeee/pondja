    package Keycard;

import Hotel.Status;



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
   
    
}