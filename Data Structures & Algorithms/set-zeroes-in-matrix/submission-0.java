class Solution {
    public void setZeroes(int[][] matrix) {
        int []temprow=new int[matrix.length];
        int []tempcol=new int[matrix[0].length];

        Arrays.fill(temprow,-1);
        Arrays.fill(tempcol,-1);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    temprow[i]=0;
                    tempcol[j]=0;
                }
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(temprow[i]==0 || tempcol[j]==0){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
