import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];
        String highestGradeName = "";
        int highestGrade = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            String name = scanner.nextLine();
            while (name.contains(" ") || !Character.isUpperCase(name.charAt(0))) {
                System.out.print("Invalid name. Please enter name " + (i+1) + " again: ");
                name = scanner.nextLine();
            }

            System.out.print("Enter grade " + (i+1) + ": ");
            int grade = scanner.nextInt();
            scanner.nextLine();
            while (grade < 1 || grade > 100) {
                System.out.print("Invalid grade. Please enter grade " + (i+1) + " again: ");
                grade = scanner.nextInt();
                scanner.nextLine();
            }

            Student student = new Student(name, grade);
            students[i] = student;

            if (grade > highestGrade) {
                highestGrade = grade;
                highestGradeName = name;
            }
        }

        System.out.println("The name with the highest grade is: " + highestGradeName + " With " + highestGrade + "%");
    }
}



