package pradeep;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0;
        int b=1;
        int c=0;
        System.out.print("Enter the Number");
        int num=input.nextInt();
        for(int i=0;i<=num;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}

