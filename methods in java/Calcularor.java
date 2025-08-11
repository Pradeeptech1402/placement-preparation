package Exercise;

import java.util.Scanner;

public class Calcularor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.println("---Calculator---");
            System.out.println("1.Addition\n2.Substraction\n3.Multiplication\n4.Devision");
            System.out.print("Select Operation: ");
            int option=input.nextInt();
            System.out.print("Enter the two number with space: ");
            int num1=input.nextInt();
            int num2=input.nextInt();
            switch (option) {
                case 1: {
                    System.out.println("Addition of "+num1+" and "+num2+" is "+add(num1, num2));
                    break;
                }
                case 2: {
                    System.out.println("Substraction of "+num1+" and "+num2+" is "+sub(num1, num2));
                    break;
                }
                case 3: {
                    System.out.println(num1+" times "+num2+" is "+mul(num1,num2));
                    break;
                }
                case 4: {
                    System.out.println(num1+" Devids "+num2+" "+dev(num1,num2)+" times");
                    break;
                }
            }
        }
    }
    static int add(int a, int b){
        return a+b;
    }
    static int sub(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static int dev(int a, int b){
        return a/b;
    }
}
