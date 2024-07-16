class Solution {
    public void setZeroes(int[][] matrix) {
        boolean rflag = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        int r,c;
        for(r=0;r<rows;r++){
            for(c=0;c<cols;c++){
                if(matrix[r][c] == 0){
                    matrix[0][c] = 0;
                    if(r>0){
                        matrix[r][0]=0;
                    }
                    else{
                        rflag = true;
                    }
                }
                
            }
        }
        for(r=1;r<rows;r++){
            for(c=1;c<cols;c++){
                if(matrix[0][c]==0 || matrix[r][0]==0){
                    matrix[r][c] = 0;
                }
            }
        }
        if(matrix[0][0]==0){
            for(r=0;r<rows;r++){
                matrix[r][0]=0;
            }
        }
        if(rflag){
            for(c=0;c<cols;c++){
                matrix[0][c]=0;
            }
        }


    }
}