package pradeep;

import java.util.Scanner;

public class Reversenumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=input.nextInt();
        int count=0;
        while(a>0){
            int num=a%10;
            count=(count*10)+num;
            a=a/10;
        }
        System.out.print("Reversed number is: ");
        System.out.println(count);

    }
}
