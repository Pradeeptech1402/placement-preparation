package Exercise;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.print("Enter number: ");
            int value=input.nextInt();
            int container=1;
            for(int i=1;i<=value;i++){
                container*=i;
            }
            System.out.println("Factorial of "+value+" is "+container);
        }
    }
}
