public class Transform extends Commands{
  String lastCommand;

  public Transform(String commands){
    super(commands); 
    lastCommand = ""; 
  }

  public void setLastCommand(String lastCommand){
    this.lastCommand = lastCommand;
  }

  public void doCommand(Table table){


    fin_row = lastCommand.charAt(4)-'1';
    fin_col = lastCommand.charAt(3) - 'a';


    if(table.vTable[fin_row][fin_col] != table.oldPiece){
    }

    if(fin_row != 7 || fin_row != 0){
      return;
    }


    if(table.vTable[fin_row][fin_col] != table.oldPiece || table.vTable[fin_row][fin_col] instanceof Pawn == false){
      return;
    }
      char transform = commands.charAt(0);
      
      if(transform == 'q' || transform == 'Q'){
        table.vTable[fin_row][fin_col] = new Queen(table.vTable[fin_row][fin_col].team,transform);
      }

      else if(transform == 'b' || transform == 'B'){
        table.vTable[fin_row][fin_col] = new Bishop(table.vTable[fin_row][fin_col].team,transform);
        
      }

      else if(transform == 'h' || transform == 'H'){
        table.vTable[fin_row][fin_col] = new Horse(table.vTable[fin_row][fin_col].team,transform);
        
      }

            else if(transform == 'k' || transform == 'K'){
        table.vTable[fin_row][fin_col] = new King(table.vTable[fin_row][fin_col].team,transform);
        
      }

            else if(transform == 'p' || transform == 'P'){
        table.vTable[fin_row][fin_col] = new Pawn(table.vTable[fin_row][fin_col].team,transform);
        
      }

            else if(transform == 't' || transform == 'T'){
        table.vTable[fin_row][fin_col] = new Tower(table.vTable[fin_row][fin_col].team,transform);
        
      }

      table.showTable();

    }  
}
