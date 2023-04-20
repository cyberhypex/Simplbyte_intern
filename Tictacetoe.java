package newPro;
import java.util.Scanner;

class Main {
  //main function
  public static void main(String[] args) {
    char[][] board = new char[3][3];//creating a 2-d array which will give us the game board
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = ' ';
      }
    }

    char player = 'X'; //assigning players their keys
    boolean gameOver = false;
    Scanner sc = new Scanner(System.in);

    while (!gameOver) {
      printBoard(board);
      System.out.print("Player " + player + " enter: ");
      int row = sc.nextInt();
      int col = sc.nextInt();
      System.out.println();

      if (board[row][col] == ' ') {
        board[row][col] = player; // place the element
        gameOver = haveWon(board, player);
        if (gameOver) {
          System.out.println("Player " + player + " has won: ");
        } else {
          
          player = (player == 'X') ? 'O' : 'X';
        }
      } else {
        System.out.println("The game is tie. Try starting the game again! \n For your sake the final board is printed as shown");
        //This is printed when game has no more valid moves to go on and shows the final boar as a proof of the same
        
      }
    }
    printBoard(board);
  }
  // winner declaration 

  public static boolean haveWon(char[][] board, char player) {
    // check the rows
    for (int row = 0; row < board.length; row++) {
      if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
        return true;
      }
    }

    // check for col
    for (int col = 0; col < board[0].length; col++) {
      if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
        return true;
      }
    }

    // diagonal
    if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
      return true;
    }

    if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
      return true;
    }
    return false;
  }

  public static void printBoard(char[][] board) {
    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        System.out.print(board[row][col] + " | ");
      }
      System.out.println();
    }
  }
}