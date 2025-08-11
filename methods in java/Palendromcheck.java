package Exercise;

import java.util.Scanner;

public class Palendromcheck {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       while(true){
           System.out.println("--Palendrome checker--");
           System.out.print("Enter the Number: ");
           int value=input.nextInt();
           System.out.println("Is "+value+" palendrome "+isPalendrome(value));
       }
    }
    static boolean isPalendrome(int input){
        int inputvalue=input;
        int container=0;
        while(input>0){
            int temp=input%10;
            container =(container*10)+temp;
            input=input/10;
        }
        return container==inputvalue;
    }
}
