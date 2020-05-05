public class Table{
  public Piece vTable[][] = new Piece[8][8];
  int round;
  Piece oldPiece;

  public void setTable(int i, int j, Piece piece){
    vTable[i][j] = piece;
  }

  public void movePiece(int init_row, int init_col, int fin_row, int fin_col){
    oldPiece = vTable[init_row][init_col];
    vTable[fin_row][fin_col] = vTable[init_row][init_col];
    vTable[init_row][init_col] = null; 

    showTable();
  }


  public void showTable(){
    for(int i=7; i>=0; i--){
      int linha = i + 1;
      System.out.print(linha + "\t");
      
      for(int j=0; j<8; j++){

        if(vTable[i][j] == null){
          System.out.print('-' + "\t");
        }
        else{

        System.out.print(vTable[i][j].getSymbol() + "\t");
        }
      }

      System.out.print("\n");
    }
    System.out.println("\t" + "a\t"+"b\t"+"c\t"+ "d\t"+ "e\t"+ "f\t"+ "g\t" + "h"  + "\n");
    System.out.print("\n");
  }


}