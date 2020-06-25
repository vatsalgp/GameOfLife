package life;

import java.util.Random;
import java.util.Scanner;

public class Main {

    final private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        int m = scanner.nextInt();
        Matrix matrix = new Matrix(size);
        matrix.init(seed);
        for (int i = 0; i < m; i++)
            matrix = Universe.next(matrix);
        matrix.print();
    }
}

class Matrix {
    boolean[][] matrix;

    Matrix(int size) {
        matrix = new boolean[size][size];
    }

    int getSize() {
        return matrix.length;
    }

    void init(long seed) {
        int size = getSize();
        Random random = new Random(seed);
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = random.nextBoolean();
    }

    void print() {
        for (boolean[] arr : matrix) {
            for (boolean ele : arr) {
                if (ele)
                    System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

class Universe {
    public static Matrix next(Matrix in) {
        int size = in.getSize();
        Matrix out = new Matrix(size);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int NoOfAliveNeighbours = getAliveNeighbours(in, i, j);
                out.matrix[i][j] = NoOfAliveNeighbours == 3 || NoOfAliveNeighbours == 2 && in.matrix[i][j];
            }
        }
        return out;
    }

    public static int getAliveNeighbours(Matrix m, int x, int y) {
        int count = 0;
        int size = m.getSize();
        for (int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++)
                if (!(i == 0 && j == 0))
                    if (m.matrix[(x + i + size) % size][(y + j + size) % size])
                        count++;
        return count;
    }
}