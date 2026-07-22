class NumMatrix {

    int[][] transformed;

    public NumMatrix(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        transformed = new int[rows][cols];

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                transformed[i][j] = (j==0?0:transformed[i][j-1])+matrix[i][j];
            }
        }

        for(int j=0;j<cols;j++) {
            for(int i=0;i<rows;i++) {
                transformed[i][j] += i==0?0:transformed[i-1][j];
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {

        int c = 0;
        if (row1!=0 && col1!=0) {
            c = transformed[row1-1][col1-1];
        }
        int a = col1==0?0:transformed[row2][col1-1];
        int b = row1==0?0:transformed[row1-1][col2];

        return transformed[row2][col2]-a-b+c;

    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
