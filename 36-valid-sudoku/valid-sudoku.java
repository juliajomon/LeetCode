class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];  
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[][] square = new HashSet[3][3];
        
        for(int r = 0 ; r<9 ; r++){
            for(int c = 0 ; c<9 ; c++){
               if (rows[r] == null) rows[r] = new HashSet<>();
                if (cols[c] == null) cols[c] = new HashSet<>();
                if (square[r / 3][c / 3] == null) square[r / 3][c / 3] = new HashSet<>();

                if(board[r][c]== '.'){
                    continue;
                }
                if(rows[r].contains(board[r][c]) || cols[c].contains(board[r][c]) || square[(r/3)][(c/3)].contains(board[r][c])){
                    return false;
                }
                rows[r].add(board[r][c]);
                cols[c].add(board[r][c]);
                square[r/3][c/3].add(board[r][c]);
            }
        }
        return true;
    }
}