package src.main.com.logesh.backtracking;

/**
 * This class represents a maze problem with path restrictions.
 * It uses backtracking to find all possible paths from the top-left to the bottom-right corner.
 */
public class MazeWithPathRestrictions {

    /**
     * The main method to run the program.
     *
     * @param args command line arguments (not used in this program)
     */
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        mazePath("", 0, 0, maze);
    }

    /**
     * This method finds all possible paths in the maze.
     *
     * @param processed the current path being processed
     * @param row the current row position in the maze
     * @param column the current column position in the maze
     * @param maze the 2D boolean array representing the maze
     */
    static void mazePath(String processed, int row, int column, boolean[][] maze) {
        // Base case: if the current position is the bottom-right corner, print the path
        if (row == maze.length - 1 && column == maze[0].length - 1) {
            System.out.println(processed);
            return;
        }

        // If the current position is not a valid path, return
        if (!maze[row][column]) {
            return;
        }

        // Recursive case: explore downwards
        if (row < maze.length - 1) {
            mazePath(processed + "D", row + 1, column, maze);
        }

        // Recursive case: explore rightwards
        if (column < maze[0].length - 1) {
            mazePath(processed + "R", row, column + 1, maze);
        }
    }
}
