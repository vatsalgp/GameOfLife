package life;

class Universe {
    public static Matrix next(final Matrix in) {
        final int size = in.getSize();
        final Matrix out = new Matrix(size);
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                out.matrix[i][j] = next(in, i, j);
        return out;
    }

    private static boolean next(final Matrix m, final int i, final int j) {
        final int NoOfAliveNeighbours = getAliveNeighbours(m, i, j);
        return NoOfAliveNeighbours == 3 || NoOfAliveNeighbours == 2 && m.matrix[i][j];
    }

    private static int getAliveNeighbours(final Matrix m, final int x, final int y) {
        int count = 0;
        final int size = m.getSize();
        for (int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++)
                if (!(i == 0 && j == 0))
                    if (m.matrix[(x + i + size) % size][(y + j + size) % size])
                        count++;
        return count;
    }
}