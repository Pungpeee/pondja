package RoomType;

import java.util.Scanner;

public class CheckOut {
    private static int number;
//    private SingleRoom sr;
//    private DoubleRoom dr;
//    private QuadRoom qr;
//    private SuiteRoom se;

    public CheckOut() {
    }

    public void checkOut() {
        SingleRoom sr = new SingleRoom();
        DoubleRoom dr = new DoubleRoom();
        QuadRoom qr = new QuadRoom();
        SuiteRoom se = new SuiteRoom();
        Scanner num = new Scanner(System.in);
        do {
            System.out.println("1. CheckOut Single Room");
            System.out.println("2. CheckOut Double Room");
            System.out.println("3. CheckOut Quad Room");
            System.out.println("4. CheckOut Suite Room");
            System.out.print("Select you room type : ");
            int number;
            number = num.nextInt();
            if (number == 1) {
                sr.checkOut();
            } else if (number == 2) {
                dr.checkOut();
            } else if (number == 3) {
                qr.checkOut();
            } else if (number == 4){
                se.checkOut();
            }
        }while (number != 5);
    }
    
}
