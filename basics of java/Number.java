package Exercise;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.print("Enter The Number: ");
            int value=input.nextInt();
            if(value%2==0){
                System.out.println("Enterd Number is 'Even'");
            }else{
                System.out.println("Enterd Number is 'Odd'");
            }
        }
    }
}
