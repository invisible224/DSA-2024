// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.

// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]


public class SetMatrixZeroes {
        public void setZeroes(int[][] matrix) {
            int row = matrix.length;
            int col = matrix[0].length;
    
            boolean[] r = new boolean[row];
            boolean[] c = new boolean[col];
    
            // First pass: Mark rows and columns that need to be zeroed
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (matrix[i][j] == 0) {
                        r[i] = true;
                        c[j] = true;
                    }
                }
            }
    
            // Second pass: Zero out marked rows
            for (int i = 0; i < row; i++) {
                if (r[i]) {
                    for (int j = 0; j < col; j++) {
                        matrix[i][j] = 0;
                    }
                }
            }
    
            // Third pass: Zero out marked columns
            for (int j = 0; j < col; j++) {
                if (c[j]) {
                    for (int i = 0; i < row; i++) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
    
    
}
