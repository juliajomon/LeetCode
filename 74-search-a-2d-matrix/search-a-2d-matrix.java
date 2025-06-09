class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;           
        int n = matrix[0].length; 
        int row = searchpotentialrow(matrix , target, 0 , m-1);
        if (row == -1) return false;
        int low = 0;
        int high = n-1;
        return binary(matrix ,row ,target ,low ,high);
    }
    public int searchpotentialrow(int[][] matrix , int target , int low , int high){
        int m = matrix.length;           
        int n = matrix[0].length;  
    
        while(low <= high){
            int mid = low + (high - low)/2;
            if( matrix[mid][0] <=  target && target <= matrix[mid][n-1]){
                return mid;
            }
            else if (matrix[mid][0] >  target){
                
                high = mid -1 ;
                
            }
            else{
                low = mid +1;

            }
            
        }return -1; // Not found

    }
    private boolean binary(int[][] matrix , int row ,int target , int low , int high){
        while(low <= high){
            int mid =  low + (high - low)/2;
            if(target == matrix[row][mid]){
                return true;
            }
            else if(target < matrix[row][mid]){
                high = mid -1;
                return binary(matrix ,row ,target ,low ,high);
            }
            else {
                low = mid+1;
                return binary(matrix ,row ,target ,low ,high);
            }
        }return false;
    }
}