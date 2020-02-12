import com.sun.glass.ui.Size;

public class GameOfLife {

    int Size;
    int[][] Board;
    int[][] Previous;
//    int rows;
//    int columns;
//    int Board = B;
//    int Size = S;
//    int[][]Previous = P;

    // default constructor //
    public GameOfLife(){}

    // constructor that takes the size of rows and columns of the Board and Previous //
    public GameOfLife(int rows, int columns, int[][] P, int[][] B, int S){
        this.Size = Size;

        Size = S;
        Previous = P;
        rows = 7;
        columns = 7;
    }

    // constructor that takes a 2D array as an input
    public GameOfLife(int[][] a, int[][] P, int[][] B, int[][] S){
//        this.a.length = Size;
//        this.Previous = Size;
        this.Board = S;
        this.Previous = S;

//
//        int[][] Previous = new Size[][];
//        int[][] Board = new int[5][5];
//        int B[][] = Size;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < Previous.length; j++){
                //this.Previous = Size[][];
            }
        }
        // save a's size to size: a.length
        // initialize preivious to size
        // nested for loop: copying from a to previous
        // initialize your board to size
    }
    // getters //
    public int[][] getBoard(int[][] B) {
        return B;
    }

    public int[][] getPrevious(int[][] P){
        return P;
    }

    public int[][] getSize(int[][] S){
        return S;
    }

    // setters //
    public void setBoard(int[][] B){
        Board = B;
    }

    public void setPrevious(int[][] P){
        Previous = P;
    }

    public void setSize(int S){
        Size = S;
    }

    // transforms the current board into its next shape //
    public void oneStep(){
        for(int l = 0; l <= rows; l++){
            for(int k = 0; k <= columns; k++){
             // rules in the game
                // if the cell is lonely with less than two neighbors, then the cell dies.
             if((Board[l][k] == 1) && (neighbors(i,j) < 2){
                 Board[l][k] = 0;
             }
             if()
            }
        }
    }

    // takes two indices ( row index and column index ) and computes the number of neighbors the cell has. //
    public void neighbors(int rows, int columns){
        int aliveNeighbors = 0;
        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= columns; j++){
                aliveNeighbors += Board[i][j];
            }
        }
    }

    // takes an integer n, which represents the number of evolution steps we need to conduct
    //Transforms the board into the board after n steps of evolution (i.e., nsuccessive calls to oneStep
    public void evolution(){

    }
}
