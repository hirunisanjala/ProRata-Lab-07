import java.util.Scanner;

public class IT23249820Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.println("Enter marks for four subjects:");

        for (int subject = 1; subject <= 4; subject++) {
            System.out.print("Enter Subject Mark " + subject + ": ");
            total += input.nextDouble();
        }

        double average = total / 4.0;
        String grade;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);

        input.close();
    }
}