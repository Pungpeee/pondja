package RoomType;

import Keycard.KeycardStatus;
import static RoomType.SingleRoom.number;
import java.time.LocalDate;
import java.util.Scanner;
        
public class Room{
     
    
    private SingleRoom singleRoom;
    private DoubleRoom doubleRoom;
    private QuadRoom quadRoom;
    private SuiteRoom suiteRoom;    
    

    public Room() {
    }

    public SingleRoom getSingleRoom() {
        return singleRoom;
    }

    public DoubleRoom getDoubleRoom() {
        return doubleRoom;
    }

    public QuadRoom getQuadRoom() {
        return quadRoom;
    }

    public SuiteRoom getSuiteRoom() {
        return suiteRoom;
    }

    public void setSingleRoom(SingleRoom singleRoom) {
        this.singleRoom = singleRoom;
    }

    public void setDoubleRoom(DoubleRoom doubleRoom) {
        this.doubleRoom = doubleRoom;
    }

    public void setQuadRoom(QuadRoom quadRoom) {
        this.quadRoom = quadRoom;
    }

    public void setSuiteRoom(SuiteRoom suiteRoom) {
        this.suiteRoom = suiteRoom;
    }

    @Override
    public String toString() {
        return "Room{" + "singleRoom=" + singleRoom + ", doubleRoom=" + doubleRoom + ", quadRoom=" + quadRoom + ", suiteRoom=" + suiteRoom + '}';
    }

}