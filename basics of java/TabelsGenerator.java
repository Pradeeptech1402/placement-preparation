package Exercise;

import java.util.Scanner;

public class Tabels {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while(true){
            System.out.print("Enter Number: ");
            int value=input.nextInt();
            for(int i=1;i<=10;i++){
                System.out.println(value+"*"+i+"="+(value*i));
            }
        }
    }

}
