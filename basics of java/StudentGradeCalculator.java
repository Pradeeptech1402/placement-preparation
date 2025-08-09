package Exercise;

import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects=input.nextInt();
        int obtainedmarks=0;
        int maxmarks=0;
        for(int i=1;i<=numberOfSubjects;i++){
            System.out.print("Enter the Maximum marks for Subject "+i+": ");
             maxmarks += input.nextInt();
            System.out.print("Enter Obtained marks: ");
            obtainedmarks+=input.nextInt();
        }
        System.out.println("Obtained marks: "+obtainedmarks);
        System.out.println("Maximum marks: "+maxmarks);
        double result = (((double)obtainedmarks / maxmarks * 100));

        System.out.println("Result :"+result+"%");
        if (result<35){
            System.out.println("Grade: "+"F");
        }else{
            System.out.println("Grade: "+"P");
        }
    }
}
