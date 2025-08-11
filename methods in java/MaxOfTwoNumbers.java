package Exercise;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            System.out.println("---Checks Max of Two Numbers---");
            System.out.print("Enter two numbers with space: ");
            int a=input.nextInt();
            int b=input.nextInt();
            System.out.println(max(a,b));
        }
    }
    static int max(int a,int b){
        if(a>b){
            return a;
        }else if (a<b){
            return b;
        }else{
            return a|b;
        }
    }
}
