class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet seen = new HashSet<>();
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] != '.'){
                    if(!seen.add("row"+i+board[i][j]) || !seen.add("col"+j+board[i][j])){
                        return false;
                    }
                    
                    if(!seen.add("box"+((i/3)*3+(j/3))+board[i][j])){
                        return false;
                    }
                    
                }
            }
        }
        return true;    
//         HashSet hs = new HashSet();
        
//         for(int i=0; i<9; i++){
//             for(int j=0; j<9; j++){
//                 if(board[i][j] != '.'){
//                     if(!hs.add("row"+i+board[i][j]) || !hs.add("column"+j+board[i][j])){
//                         return false;
//                     }
                    
//                     if(!hs.add("box"+((i/3)*3+(j/3))+board[i][j])){
//                         return false;
//                     }
//                 }
//             }
//         }
//         return true;
    }
}