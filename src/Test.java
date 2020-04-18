
import Room.BookedRoom;
import java.util.Scanner;


public class Test {
    private static int number;
    
    public static void main(String[] args) {
        BookedRoom bk = new BookedRoom();
        
        Scanner num = new Scanner(System.in);
        
        do{
            System.out.println("--------------------<< Main Menu >>----------------------");
            System.out.println("1.Booked Room");
            System.out.println("2.");
            System.out.println("3. ");
            System.out.println("Enter Your Menu(1-3) : ");
            
            number = num.nextInt();
            if(number == 1){
                System.out.println("//////Booked Room\\\\\\");
                bk.setName();
                bk.setTypeOfRoom();
                bk.setTotalOfRoom();
                
            } else if (number == 2){
                System.out.println("");
                //รอชื่อ method
                
            } else if (number == 3){
                System.out.println("");
                //รอชื่อ method
                
            }else 
                System.out.println("Please input 1-3");
        }while( number != 3);
        
    }
}
