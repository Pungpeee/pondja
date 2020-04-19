package Hotel;

import java.util.Scanner;


public class Guest {
    private String firstname;
    private String surname;
    private int rooms;
    Scanner IP_name = new Scanner(System.in);

    public Guest(String firstname, String surname, int rooms) {
        this.firstname = firstname;
        this.surname = surname;
        this.rooms = rooms;
    }

    public Guest() {
        
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public int getRooms() {
        return rooms;
    }

    public void setFirstname() {
        System.out.println("Firstname : ");
        firstname = IP_name.nextLine();
    }

    public void setSurname() {
        System.out.println("Surname : ");
        surname = IP_name.nextLine();
        
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    
    
    
}