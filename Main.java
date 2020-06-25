package life;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        scanner.close();
        Matrix matrix = new Matrix(size);
        matrix.init();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Generation #" + i);
            System.out.println("Alive: " + matrix.getAlive());
            matrix.print();
            matrix = Universe.next(matrix);
            Thread.sleep(500);
            System.out.println();
        }
    }
}