package src.main.com.logesh.backtracking;


import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board = new boolean[n][n];
        System.out.println(knights(board,0,0,6));
    }
    static int knights(boolean[][] board, int row, int col, int knightCount){
        if (knightCount == 0) {
            displayBoard(board);
            return 1;
        }
        if(row==board.length-1 && col==board.length){
            return 0;
        }
        int count = 0;
        if(col== board.length){
            count+= knights(board,row+1,0,knightCount);
            return count;
        }

        if(isSafe(board,row,col)){
            board[row][col] = true;
            count = count + knights(board,row,col+1,knightCount-1);
            board[row][col] = false;
        }

       count+= knights(board,row,col+1,knightCount);

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }

        return true;
    }

    private static boolean isValid(boolean[][] board,int row, int col) {
        if(row>=0 && board.length>row && col>=0 && board.length>col){
            return  true;
        }
        return false;
    }

    private static void displayBoard(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]) {
                    System.out.print("K");
                }
                else{
                System.out.print("X");}

            }
            System.out.println();
        }
        System.out.println("---------------------");
    }
}
