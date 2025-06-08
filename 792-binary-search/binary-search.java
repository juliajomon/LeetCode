/*public class TreeNode{
    int val,index;
    TreeNode left;
    TreeNode right;
    TreeNode(int val , int index){
        this.val = val;
        this.index = index;
    }
}*/
class Solution {
    public int search(int[] nums, int target) {
        int idx = Arrays.binarySearch(nums, target);
        return idx >= 0 ? idx : -1;
        /* TreeNode root = new TreeNode(nums[0],0);
            for(int i = 1 ; i< nums.length ; i++){
                insert(root , nums[i], i);
            }
            return bstsearch(root , target);
    }
     private TreeNode insert(TreeNode root , int val , int index){
            if(root == null) return new TreeNode(val,index);
            if(root.val > val ){
                root.left = insert(root.left , val , index);
            }
            else {
                root.right = insert(root.right , val,index);
            }
            return root;

        }
        private int bstsearch(TreeNode root , int target){
            if(root == null) return -1;
            if(root.val == target) return root.index;
            if(root.val > target){
                return bstsearch(root.left ,target);
            }
            else{
                return bstsearch(root.right , target);
            }*/
        }
}