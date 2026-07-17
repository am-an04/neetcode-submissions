class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,left=0,right=n-1,bottom=m-1;
        List<Integer>ans=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                 ans.add(matrix[top][i]);
            }
            for(int i=top+1;i<=bottom;i++){
                
                    ans.add(matrix[i][right]);
                }
            
            if(top!=bottom){
            for(int i=right-1;i>=left;i--){
                    ans.add(matrix[bottom][i]);
            }
            }
            if(left!=right){
            for(int i=bottom-1;i>top;i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;top++;right--;bottom--;
        }
        return ans;
    }
}
