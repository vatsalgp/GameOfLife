package life;

import java.util.Scanner;
import life.core.Matrix;
import life.core.Universe;

public class CLI {
    public static void main(final String[] args) throws Exception {
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Size: ");
        final int size = scanner.nextInt();
        scanner.close();
        Matrix matrix = new Matrix(size);
        matrix.init();
        for (int i = 1; i <= 10; i++) {
            System.out.println("Generation #" + i);
            print(matrix);
            matrix = Universe.next(matrix);
            Thread.sleep(500);
        }
    }

    public static void print(final Matrix m) {
        System.out.println("Alive: " + m.getAlive());
        for (final boolean[] arr : m.matrix) {
            for (final boolean ele : arr) {
                final char ch = ele ? 'O' : ' ';
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();
    }
}