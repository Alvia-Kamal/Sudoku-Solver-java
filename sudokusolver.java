class Solution {
    public void solveSudoku(char[][] board) {
      solver(board);  
    }
    public boolean solver(char[][] board){
        
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]=='.'){
                    for(char c='1';c<='9';c++){
                        if(isValid(board,i,j,c)){
                            board[i][j]=c;
                            if(solver(board))
                            return true;
                            else
                            board[i][j]='.';
                        }
                    }

                    return false;
                }
                


            }
        }
        return true;
    }

    public boolean isValid(char[][] board,int i,int j, char c){
        for(int l=0;l<9;l++){

        if(board[i][l]==c)
        return false;
        
        if(board[l][j]==c)
        return false;
        
        if(board[l/3+3*(i/3)][l%3+(j/3)*3]==c)
        return false;
    }
    return true;}
}
