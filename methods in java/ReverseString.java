package Exercise;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        while(true){
            System.out.println("---Reverse String---");
            System.out.print("Enter the String: ");
            Scanner input=new Scanner(System.in);
            String string=input.nextLine();
            System.out.println(reverse(string));
        }
    }

    static String reverse(String word) {
        String container="";
        int length=word.length();
        for(int i=length-1;i>=0;i--){
            container+=word.charAt(i);
        }
        return container;
    }
}
