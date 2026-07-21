import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {

    static void solve(
            int row,
            int n,
            char[][] board,
            boolean[] columns,
            boolean[] diagonal,
            boolean[] antiDiagonal,
            List<List<String>> result) {

        if (row == n) {

            List<String> solution = new ArrayList<>();

            for (char[] currentRow : board) {
                solution.add(new String(currentRow));
            }

            result.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {

            int diagonalIndex = row - col + n - 1;
            int antiDiagonalIndex = row + col;

            if (columns[col]
                    || diagonal[diagonalIndex]
                    || antiDiagonal[antiDiagonalIndex]) {
                continue;
            }

            // Choose
            board[row][col] = 'Q';
            columns[col] = true;
            diagonal[diagonalIndex] = true;
            antiDiagonal[antiDiagonalIndex] = true;

            // Explore
            solve(
                    row + 1,
                    n,
                    board,
                    columns,
                    diagonal,
                    antiDiagonal,
                    result
            );

            // Backtrack
            board[row][col] = '.';
            columns[col] = false;
            diagonal[diagonalIndex] = false;
            antiDiagonal[antiDiagonalIndex] = false;
        }
    }

    public static List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        solve(
                0,
                n,
                board,
                new boolean[n],
                new boolean[2 * n - 1],
                new boolean[2 * n - 1],
                result
        );

        return result;
    }

    public static void main(String[] args) {

        int n = 4;

        List<List<String>> result = solveNQueens(n);

        for (List<String> solution : result) {
            System.out.println(solution);
        }
    }
}
