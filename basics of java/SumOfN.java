package Exercise;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       while(true){
           System.out.println("Sum of first N natural number generator");
           System.out.print("Enter Number: ");
           int value=input.nextInt();
           int num=0;
           for(int i=0;i<=value;i++){
               num+=i;
           }
           System.out.println("Sum of first "+value+" natural number is: "+num);
       }
    }
}
