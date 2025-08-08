package Exercise;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int balance=1000;
        while(true){
            System.out.println("----Menue--- \n 1.Deposit \n 2.Withdraw \n 3.Check Balance \n 4.Exit");
            System.out.print("Enter your Choice: ");
            int value=input.nextInt();
            if(value==1){
                System.out.print("Enter The Amounta:");
                int deposit=input.nextInt();
                balance += deposit;
                System.out.println("Amount Deposited Sucessfully");
            }else if(value==2){
                System.out.print("Enter The Amount: ");
                int withdraw=input.nextInt();
                balance -= withdraw;
                System.out.println("Amount Withdrawed Sucessfully");
            }else if(value==3){
                System.out.println("Your Balance is:"+balance);
                input.nextLine();
                System.out.print("input 'r' to return Menue and 'exit' to Exit: ");
                String procede=input.nextLine();
                if(procede.charAt(0)=='r'){
                    continue;
                }else if(procede.equals("exit")||procede.charAt(0)=='E'||procede.charAt(0)=='e'){
                    break;
                }
            }else if (value==4){
                System.out.println("Are you Sure to 'Exit' (y/n):");
                String procede=input.next();
                if(procede.charAt(0)=='Y'|| procede.charAt(0)=='y') {
                    System.out.println("Exit sucessfully");
                    break;
                }
            }
        }
    }
}
