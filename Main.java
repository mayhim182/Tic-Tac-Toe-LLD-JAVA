import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    Player player1 = new Player("Player 1", 'X');
    Player player2 = new Player("Player 2", 'O');

    TicTacToe ticTacToe = new TicTacToe(player1, player2);

    while(true) {
      ticTacToe.printBoard();
      System.out.println("Enter row and column for "+ (ticTacToe.getCurrentPlayer() == 0 ? player1.getName() : player2.getName()));
      int row = scanner.nextInt();
      int col = scanner.nextInt();
      if(ticTacToe.playTurn(row, col)) {
        ticTacToe.printBoard();
        break;
      }
    }

    scanner.close();
  }

}
