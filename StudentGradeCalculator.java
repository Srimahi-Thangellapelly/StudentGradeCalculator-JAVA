import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************************");
        System.out.println("        WELCOME TO GRADE CALCULATOR       ");
        System.out.println("******************************************\n");

        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];
        double total = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            while (marks[i] < 0 || marks[i] > 100) {
                System.out.print("Invalid marks! Enter marks between 0 and 100: ");
                marks[i] = scanner.nextDouble();
            }
            total += marks[i];
        }

        double average = total / numSubjects;
        char grade = calculateGrade(average);

   
        System.out.println("\n^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("              FINAL REPORT                 ");
        System.out.println("..........................................");

        for (int i = 0; i < numSubjects; i++) {
            System.out.printf("Subject %d: %.2f marks%n", (i + 1), marks[i]);
        }

        System.out.println("------------------------------------------");
        System.out.printf("Total Marks: %.2f%n", total);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.println("Grade Awarded: " + grade);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        
        printMotivationalMessage(grade);

        scanner.close();
    }

    private static char calculateGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 60) return 'B';
        else if (avg >= 50) return 'C';
        else return 'F';
    }

    private static void printMotivationalMessage(char grade) {
        System.out.println();

        switch (grade) {
            case 'A':
                System.out.println(" Outstanding performance! Keep soaring higher!");
                break;
            case 'B':
                System.out.println(" Great job! You're on the right path to success!");
                break;
            case 'C':
                System.out.println(" Good effort! Keep pushing and you'll get there!");
                break;
            case 'D':
                System.out.println(" Don't give up! Use this as motivation to improve!");
                break;
            case 'F':
                System.out.println(" Failure is just a stepping stone. Rise and grind harder!");
                break;
            default:
                System.out.println("Keep working hard, success is around the corner!");
        }
    }
}
