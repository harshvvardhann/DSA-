package ContestProblems.ContestProblems;

import java.util.ArrayList;
import java.util.List;

public class zigzagPatterninArray {
    public static List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> result = new ArrayList<>();
        int rows = grid.length;
        int cols = grid[0].length;
        boolean skip = true;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Even row: Traverse left to right
                for (int j = 0; j < cols; j++) {
                    if (skip) {
                        result.add(grid[i][j]);
                    }
                    skip = !skip;
                }
            } else {
                // Odd row: Traverse right to left
                for (int j = cols - 1; j >= 0; j--) {
                    if (skip) {
                        result.add(grid[i][j]);
                    }
                    skip = !skip;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] grid = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        List<Integer> result = zigzagTraversal(grid);
        System.out.println(result);
    }
}
