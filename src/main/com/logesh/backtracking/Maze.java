package src.main.com.logesh.backtracking;

import java.util.ArrayList;

/**
 * This class represents a Maze problem.
 */
public class Maze {

    /**
     * The main method to test the functionality of the Maze class.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        System.out.println(mazeCount(3, 3));
        mazePath("",3,3);
        System.out.println(mazePathReturn("",3,3));
        System.out.println(mazePathIncludeDiagonalReturn("",3,3));
    }

    /**
     * This method calculates the number of unique paths in a maze.
     *
     * @param row the number of rows in the maze
     * @param column the number of columns in the maze
     * @return the number of unique paths
     */
    static int mazeCount(int row, int column) {
        if (row == 1 || column == 1) {
            return 1;
        }
        int left = mazeCount(row - 1, column);
        int right = mazeCount(row, column - 1);

        return left + right;
    }

    /**
     * This method prints all the unique paths in a maze.
     *
     * @param processed the current path being processed
     * @param row the number of rows in the maze
     * @param column the number of columns in the maze
     */
    static void mazePath(String processed,int row, int column) {
        if (row == 1 && column == 1) {
            System.out.println(processed);
            return;
        }
        if(row>1) {
            mazePath(processed+"D", row - 1, column);
        }
        if(column>1) {
            mazePath(processed+"R", row, column - 1);
        }
    }

    /**
     * This method returns all the unique paths in a maze as a list of strings.
     *
     * @param processed the current path being processed
     * @param row the number of rows in the maze
     * @param column the number of columns in the maze
     * @return a list of all unique paths
     */
    static ArrayList<String> mazePathReturn(String processed, int row, int column) {
        if (row == 1 && column == 1) {
            ArrayList<String> result = new ArrayList<String>();
            result.add(processed);
            return result;
        }
        ArrayList<String> finalResult= new ArrayList<String>();
        if(row>1) {
            finalResult.addAll(mazePathReturn(processed+"D", row - 1, column));
        }
        if(column>1) {
            finalResult.addAll(mazePathReturn(processed+"R", row, column - 1));
        }
        return finalResult;
    }

    /**
     * This method returns all the unique paths in a maze including diagonal movements as a list of strings.
     *
     * @param processed the current path being processed
     * @param row the number of rows in the maze
     * @param column the number of columns in the maze
     * @return a list of all unique paths including diagonal movements
     */
    static ArrayList<String> mazePathIncludeDiagonalReturn(String processed, int row, int column) {
        if (row == 1 && column == 1) {
            ArrayList<String> result = new ArrayList<String>();
            result.add(processed);
            return result;
        }
        ArrayList<String> finalResult= new ArrayList<String>();
        if(row>1 && column>1){
            finalResult.addAll(mazePathIncludeDiagonalReturn(processed+"D",row-1,column-1));
        }
        if(row>1) {
            finalResult.addAll(mazePathIncludeDiagonalReturn(processed+"V", row - 1, column));
        }
        if(column>1) {
            finalResult.addAll(mazePathIncludeDiagonalReturn(processed+"H", row, column - 1));
        }
        return finalResult;
    }
}
