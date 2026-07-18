class Solution {
    public void setZeroes(int[][] matrix) {
        int []tempr=new int[matrix.length];
        int []tempc=new int[matrix[0].length];
        Arrays.fill(tempr,-1);
        Arrays.fill(tempc,-1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                     tempr[i]=0;
                     tempc[j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(tempr[i]==0 || tempc[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
