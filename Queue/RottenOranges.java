import java.util.*;

public class RottenOranges {

    static class Pair {
        int row, col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int orangesRotting(int[][] grid) {

        Queue<Pair> queue = new LinkedList<>();
        int fresh = 0;
        int time = 0;

        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){

                if(grid[i][j]==2)
                    queue.offer(new Pair(i,j));

                if(grid[i][j]==1)
                    fresh++;
            }
        }

        while(!queue.isEmpty() && fresh>0){

            int size = queue.size();

            for(int i=0;i<size;i++){

                Pair p = queue.poll();

                for(int j=0;j<4;j++){

                    int nr = p.row + dr[j];
                    int nc = p.col + dc[j];

                    if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length
                            && grid[nr][nc]==1){

                        grid[nr][nc]=2;
                        fresh--;
                        queue.offer(new Pair(nr,nc));
                    }
                }
            }

            time++;
        }

        return fresh==0 ? time : -1;
    }

    public static void main(String[] args) {

        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        System.out.println(orangesRotting(grid));
    }
}
