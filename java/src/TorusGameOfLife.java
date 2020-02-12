public class TorusGameOfLife {
    public void neighbors(int rows, int columns){
        int aliveNeighbors = 0;
        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= columns; j++){
                aliveNeighbors += Board[i][j];
            }
        }
    }
}
