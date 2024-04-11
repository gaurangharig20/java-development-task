import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double[] arr=new double[5];
        Double sum=0.0;
        System.out.print("Enter marks of 5 subjects out of 100{Maths,Science,Social Studies,English,Hindi}:");
        for (int i = 1; i <5 ; i++) {
            arr[i]=sc.nextDouble();
            sum=sum+arr[i];
          
        }
        System.out.println("total marks obtained: "+sum);
        double percentage=sum/5;
        System.out.println("Average Percentage: "+percentage);
        if (percentage >=90) {
            System.out.println("Congratulations! your grade is A");
        } else if (percentage>=80) {
            System.out.println("Congratulations! your grade is B");
            
        } else if (percentage>=70) {
            System.out.println("Congratulations! your grade is C");

        } else if (percentage>=60) {
            System.out.println("Congratulations! your grade is D");
        } else if (percentage>=50) {
            System.out.println("Congratulations! your grace is E");
        }
        else{
            System.out.print("Better luck next time. you failed!");
        }

    }
}
