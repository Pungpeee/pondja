
package Room;

import DetailsOfBooked.Keycard;
import Hotel.Status;
import java.util.Scanner;

public class Room {
   
    private String firstname;
    private String surname;
    Scanner IP_name = new Scanner(System.in);

    public Room() {

    }

    public Room(String firstname, String surname) {
        this.firstname = firstname;
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setFirstname() {
        System.out.println("Firstname : ");
        firstname = IP_name.nextLine();
    }

    public void setSurname() {
        System.out.println("Surname : ");
        surname = IP_name.nextLine();

    }

    @Override
    public String toString() {
        return "Guest{" + "firstname=" + firstname + ", surname=" + surname + '}';
    }
}
