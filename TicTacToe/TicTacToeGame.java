package TicTacToe;

import java.util.Scanner;
public class TicTacToeGame {
    public static void printBoard(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean checkWinner(char[][] board, char player){
        for(int i=0; i<board.length; i++){
//      check for row
            if(board[i][0] == player && board[i][1] == player && board[i][2]==player){
                return true;
            }
//      check for col
            if(board[0][i]==player && board[1][i]==player && board[2][i]==player){
                return true;
            }

            if(board[0][0]==player && board[1][1]==player && board[2][2]==player){
                return true;
            }

            if(board[0][2]==player && board[1][1]==player && board[2][0]==player){
                return true;
            }
        }
        return false;
    }

    public static void startGame(char[][] board){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                board[i][j] = '-';
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char board[][] = new char[3][3];

        startGame(board);

        System.out.println("*****\t\t Welcome to the tic tac toe Game \t\t*****");
        printBoard(board);
        char player = 'X';
        boolean gameOver = false;
        int count = 0;

        while(!gameOver){
            System.out.println("Player "+player+" enter position: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            count++;
            if(board[row][col]=='-'){
                board[row][col] = player;
                printBoard(board);

                if(checkWinner(board, player)){
                    System.out.println("Player "+player+" has won the game.");
                    System.out.println("If you want to play again. please press 0 and for close press any key...");
                    int x = sc.nextInt();
                    if (x == 0) {
                        startGame(board);
                    }else{
                        System.out.println("Game terminated successfully...");
                        gameOver = true;
                    }
                }else{
                    if(player == 'X'){
                        player = '0';
                    }else{
                        player = 'X';
                    }
                }
            }else if(count>=8){
                System.out.println("No body won");
                printBoard(board);
                System.out.println("If you want to play again. please press 0 and for close press any key...");
                int x = sc.nextInt();
                if (x == 0) {
                    startGame(board);
                }else{
                    System.out.println("Game terminated successfully...");
                    gameOver = true;
                }
            }
            else{
                System.out.println("Invalid move");
            }
        }
    }
}
