import java.util.ArrayList;

public class RatInAMaze {

    static ArrayList<String> paths = new ArrayList<>();

    static void solve(int i, int j, int[][] maze,
                      boolean[][] visited,
                      String path) {

        int n = maze.length;

        if (i == n - 1 && j == n - 1) {
            paths.add(path);
            return;
        }

        visited[i][j] = true;

        int[] row = {1, 0, 0, -1};
        int[] col = {0, -1, 1, 0};
        char[] dir = {'D', 'L', 'R', 'U'};

        for (int k = 0; k < 4; k++) {

            int ni = i + row[k];
            int nj = j + col[k];

            if (ni >= 0 && nj >= 0 &&
                ni < n && nj < n &&
                maze[ni][nj] == 1 &&
                !visited[ni][nj]) {

                solve(ni, nj, maze, visited, path + dir[k]);
            }
        }

        visited[i][j] = false;
    }

    public static void main(String[] args) {

        int[][] maze = {
                {1,0,0,0},
                {1,1,0,1},
                {1,1,0,0},
                {0,1,1,1}
        };

        solve(0,0,maze,new boolean[4][4],"");

        System.out.println(paths);
    }
}
