public class Horse extends Piece{

  public Horse(int team,char symbol){
    super(team,symbol);
  }


    
    public void verifyMovement(int init_row, int init_col, int fin_row, int fin_col, Table table){
      System.out.println("yes1");
      super.verifyMovement(init_row, init_col,fin_row,fin_col,table);
    
    if(( Math.abs(x_movement) == 2 && Math.abs(y_movement) == 1) || ( Math.abs(x_movement) == 1 && Math.abs(y_movement) == 2 ) ){
      ///possible
    }
    else{
      return;
    }

    if(table.vTable[fin_row][fin_col] == null){
       table.movePiece(init_row,init_col, fin_row,fin_col);
    }
    else if(table.vTable[fin_row][fin_col].team != team){
        table.movePiece(init_row,init_col, fin_row,fin_col);
    }

    
  }
}
  
