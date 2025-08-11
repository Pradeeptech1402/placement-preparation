package Exercise;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.println("---Calculate Factorial---");
            System.out.print("Enter the Number: ");
            int num=input.nextInt();
            System.out.println(factorial(num));
        }
    }
    static int factorial(int num){
        int i=0;
        int container=1;
        while(i<num){
            i++;
            container*=i;
        }
        return container;
    }
}
