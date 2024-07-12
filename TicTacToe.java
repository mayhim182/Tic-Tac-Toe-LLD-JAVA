public class TicTacToe {
  private Board board;
  private Player[] players;
  private int currentPlayer;

  public TicTacToe(Player player1, Player player2) {
    board = new Board();
    players = new Player[] {player1, player2};
    currentPlayer = 0;
  }

  public boolean playTurn(int row, int col) throws Exception {
    if (board.placeMark(row, col, players[currentPlayer].getMark())) {
      if (checkWin(players[currentPlayer].getMark())) {
        System.out.println("Player "+ players[currentPlayer].getName() + " won!");
        return true;
      }

      if(board.isFull()) {
        System.out.println("The game is a draw!");
      }

      currentPlayer = (currentPlayer+1)%2;
    } else {
      System.out.println("Invalid move, try again.");
    }
    return false;
  }

  private boolean checkWin(char mark) throws Exception {
    for(int i = 0; i<3; i++) {
      //All rows
      if((board.getMark(i,0) == mark && board.getMark(i,1) == mark) && board.getMark(i, 2) == mark) {
        return true;
      }
      //All cols
      if((board.getMark(0, i)==mark && board.getMark(1, i) == mark && board.getMark(2,i)==mark))
        return true;
    }

    //Checking on diagonals
    if((board.getMark(0, 0) == mark && board.getMark(1, 1) == mark
      && board.getMark(2, 2) == mark) ||
      board.getMark(0,2) == mark && board.getMark(1,1) == mark
        && board.getMark(2,0) == mark
    )
      return true;

    return false; //Default functionality
  }


  public void printBoard() {
    board.printBoard();
  }

  int getCurrentPlayer() {
    return this.currentPlayer;
  }



}
