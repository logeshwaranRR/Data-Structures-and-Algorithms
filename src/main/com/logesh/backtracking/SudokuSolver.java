package src.main.com.logesh.backtracking;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
        } else {
            System.out.println("Cannot solve");
        }

    }

    private static void display(int[][] board) {
        for( int[] row : board) {
            for(int num :row){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static boolean solve(int[][] board) {
        int row=-1;
        int col=-1;
        int n=board.length;

        boolean emptyLeft=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyLeft=true;
                    break;
                }
            }
            // if you found some empty element in row, then break
            if(emptyLeft==true){
                break;
            }
        }
        if (emptyLeft == false) {
            return true;
            // soduko is solved
        }
        for(int i=1;i<=9;i++){
            if(isSafe(board,row,col,i)){
                board[row][col]=i;
                if(solve(board)){
                    return true;
                }
                //backtrack
                board[row][col]=0;
            }
        }
        return false;
    }

    static boolean isSafe(int[][] board,int row,int col,int num){
        //to check row
        for(int i=0;i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }

        //to check col
        for(int[] rows :board){
            if(rows[col]==num){
                return false;
            }
        }

        int sqrt=(int)Math.sqrt(board.length);
        int rowStart=row- row%sqrt;
        int colStart=col- col%sqrt;
        for(int i=rowStart;i<rowStart+sqrt;i++){
            for(int j=colStart;j<colStart+sqrt;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }

        return true;
    }
}
