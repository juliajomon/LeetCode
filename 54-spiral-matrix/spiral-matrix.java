class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowbegin = 0;
        int rowend = matrix.length -1;
        int colbegin = 0;
        int colend = matrix[0].length - 1;
        ArrayList<Integer> arr = new ArrayList<>();
        while(colbegin <= colend && rowbegin <= rowend){
            //move right
            for(int i = colbegin ; i <= colend ; i++){
                arr.add(matrix[rowbegin][i]);
            }
            rowbegin++;

            //move downward
            for(int  i = rowbegin ; i <= rowend ; i++){
                arr.add(matrix[i][colend]);
            }
            colend--;

            //move left
            if(rowbegin <= rowend){
            for(int i = colend ; i>= colbegin; i--){
                arr.add(matrix[rowend][i]);
            }
            }
            rowend--;

            //move upward
            if(colbegin <= colend){
                for(int i = rowend; i>=rowbegin ; i--){
                    arr.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }
        return arr;
        
    }
}