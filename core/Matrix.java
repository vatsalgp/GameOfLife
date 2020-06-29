package life.core;

import java.util.Random;

public class Matrix {
    public boolean[][] matrix;

    public Matrix(final int size) {
        matrix = new boolean[size][size];
    }

    public int getSize() {
        return matrix.length;
    }

    public void init() {
        final int size = getSize();
        final Random random = new Random();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = random.nextBoolean();
    }

    public int getAlive() {
        int count = 0;
        final int size = getSize();
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (matrix[i][j])
                    count++;
        return count;
    }
}