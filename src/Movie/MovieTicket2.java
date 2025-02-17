package Movie;

import 영화표예매.MovieTicket;

import java.util.Scanner;

public class MovieTicket2 {
    private final int[] seat = new int[10];

    private final int price;

    private final Scanner sc = new Scanner(System.in);

    public MovieTicket2(int price){
        this.price = price;
    }
    public void printSeat() {
        for(int e : seat) {
            if(e == 0) System.out.println("[ ]");
            else System.out.println("[V]");
        }
        System.out.println();
    }
    
}
