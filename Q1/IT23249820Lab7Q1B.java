import java.util.Scanner;

public class IT23249820Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int student = 1; student <= 3; student++) {
            double total = 0;

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            for (int subject = 1; subject <= 4; subject++) {
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

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        input.close();
    }
}