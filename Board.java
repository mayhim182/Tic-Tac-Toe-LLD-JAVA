public class Board {
  private char[][] grid;

  public Board() {
    grid = new char[3][3];
    for(int i = 0 ; i<3; i++) {
      for(int j = 0; j<3; j++) {
        grid[i][j] = '-';
      }
    }
  }


  public boolean isFull() {
    for(int i = 0; i<3; i++) {
      for(int j = 0; j<3; j++) {
        if(grid[i][j]=='-') return false; //Not full
      }
    }
    return true;
  }

  public boolean placeMark(int row, int col, char mark) {
    if(row < 0 || row >= 3 || col < 0 || col >= 3 || grid[row][col] != '-') return false;
    grid[row][col] = mark;
    return true;
  }

  public char getMark(int row, int col) throws Exception {
    if(row < 0 || row >= 3 || col < 0 || col >= 3)
      throw new Exception("Array Index out of Bound or Not A Valid move while getting mark");

    return grid[row][col];
  }

  public void printBoard() {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(grid[i][j] + " ");
      }
      System.out.println();
    }
  }



}
