package Exercise;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true) {
            System.out.println("---Check isEven--");
            System.out.print("Enter the Number: ");
            int num = input.nextInt();
            System.out.println(isEven(num));
        }
    }
    static boolean isEven(int num){
        return num % 2 == 0;
    }
}
