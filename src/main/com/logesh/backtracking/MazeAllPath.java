package src.main.com.logesh.backtracking;

import java.util.Arrays;

/**
 * This class represents a maze problem and provides methods to find all paths.
 */
public class MazeAllPath {

    /**
     * The main method to run the program.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] path = new int[maze.length][maze[0].length];
        mazeAllPath("",0,0,maze);
        mazeAllPathPrint("", 0, 0, maze, path, 1);
    }

    /**
     * This method finds all paths in the maze using backtracking.
     *
     * @param processed the current path
     * @param row the current row
     * @param column the current column
     * @param maze the maze grid
     */
    static void mazeAllPath(String processed, int row, int column, boolean[][] maze) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }
        if (!maze[row][column]) {
            return;
        }
        maze[row][column] = false;
        if (row < maze.length - 1) {
            mazeAllPath(processed + "D", row + 1, column, maze);
        }
        if (column < maze[0].length - 1) {
            mazeAllPath(processed + "R", row, column + 1, maze);
        }
        if (column > 0) {
            mazeAllPath(processed + "L", row, column - 1, maze);
        }

        if (row > 0) {
            mazeAllPath(processed + "U", row - 1, column, maze);
        }

        maze[row][column] = true;
    }

    /**
     * This method finds all paths in the maze using backtracking and prints the path with steps.
     *
     * @param processed the current path
     * @param row the current row
     * @param column the current column
     * @param maze the maze grid
     * @param path the path grid to store steps
     * @param step the current step
     */
    static void mazeAllPathPrint(String processed, int row, int column, boolean[][] maze, int[][] path, int step) {
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            path[row][column] = step;
            for (int[] r : path) {
                System.out.println(Arrays.toString(r));
            }
            System.out.println(processed);
            System.out.println();
            return;
        }
        if (!maze[row][column]) {
            return;
        }
        maze[row][column] = false;
        path[row][column] = step;
        if (row < maze.length - 1) {
            mazeAllPathPrint(processed + "D", row + 1, column, maze, path, step + 1);
        }
        if (column < maze[0].length - 1) {
            mazeAllPathPrint(processed + "R", row, column + 1, maze, path, step + 1);
        }
        if (column > 0) {
            mazeAllPathPrint(processed + "L", row, column - 1, maze, path, step + 1);
        }

        if (row > 0) {
            mazeAllPathPrint(processed + "U", row - 1, column, maze, path, step + 1);
        }

        maze[row][column] = true;
        path[row][column] = 0;
    }
}
