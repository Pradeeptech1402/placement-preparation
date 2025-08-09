package pradeep;

import java.util.Scanner;

public class countrepetednumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        while(true){
            System.out.print("Enter the number Sequence: ");
            long sequence=input.nextLong();
            System.out.print("Enter number to Count sequence: ");
            int number=input.nextInt();
            int count=0;
            while(sequence>0){
                if(sequence%10==number){
                    count++;
                }
                sequence=sequence/10;
            }
            System.out.println(number+" Repeted "+count+" time in sequence");
        }
    }
}
