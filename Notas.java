import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el número de notas: ");
        int numGrades = scanner.nextInt();

        if (numGrades <= 0) {
            System.out.println("Por favor, introduzca un número válido de notas.");
            scanner.close();
            return;
        }

        int sum = 0;

        for (int i = 1; i <= numGrades; i++) {
            System.out.print("Introduzca la nota" + i + ": ");
            int grade = scanner.nextInt();

            if (grade < 0 || grade > 10) {
                System.out.println("Por favor, introduzca una nota válida entre 0 y 10.");
                i--;
                continue;
            }

            sum += grade;
        }

        double average = (double) sum / numGrades;

        System.out.printf("Average Grade: %.1f%n", average);

        scanner.close();
    }
}