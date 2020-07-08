package life;

import life.core.*;

public class CLI {
    public static void main(final String[] args) {
        Matrix matrix = new Matrix();
        matrix.init();
        while (true) {
            printMatrix(matrix);
            matrix = Universe.next(matrix);
            Sleep.sleep();
        }
    }

    private static void printMatrix(final Matrix m) {
        printLimiter(m);
        for (final boolean[] arr : m.matrix) {
            for (final boolean ele : arr) {
                final char ch = ele ? 'O' : ' ';
                System.out.print(ch);
            }
            System.out.println();
        }
        printLimiter(m);
    }

    private static void printLimiter(final Matrix m) {
        for (int i = 0; i < m.matrix.length; i++)
            System.out.print("-");
        System.out.println();
    }
}