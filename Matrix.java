package life;

import java.util.Random;

public class Matrix {
    public boolean[][] matrix;

    public Matrix(int size) {
        matrix = new boolean[size][size];
    }

    public int getSize() {
        return matrix.length;
    }

    public void init(long seed) {
        int size = getSize();
        Random random = new Random(seed);
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = random.nextBoolean();
    }

    public void init() {
        int size = getSize();
        Random random = new Random();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = random.nextBoolean();
    }

    public void print() {
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

    public int getAlive() {
        int count = 0;
        int size = getSize();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (matrix[i][j])
                    count++;
        return count;
    }
}