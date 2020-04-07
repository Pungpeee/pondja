package Hotel;


public class Guest {
    private String firstname;
    private String surname;
    private int rooms;

    public Guest(String firstname, String surname, int rooms) {
        this.firstname = firstname;
        this.surname = surname;
        this.rooms = rooms;
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

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
    
    
    
}