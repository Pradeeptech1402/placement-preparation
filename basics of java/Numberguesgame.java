package Exercise;

import java.util.Scanner;

public class Numberguesgame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int i=0;
        while(true){
            System.out.print("Enter Number");
            int value = input.nextInt();
            i++;
            if (value < number) {
                System.out.println(" Too less ");
            } else if (value > number) {
                System.out.println("Too high");
            } else if (value == number) {
                System.out.println("You Won");
                System.out.println("You Took "+i+" chance to Find");
                break;
            } else {
                System.out.println("errror");
            }
        }
    }

}

