class Solution {
    public void rotate(int[][] matrix) {
        
        transpose(matrix);
        
         for(int i = 0 ; i < matrix.length; i++)
        {
            for(int j = 0 ; j <= (matrix.length-1)/2 ; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length -1 - j];
                matrix[i][matrix.length -1 - j] = temp;
               // System.out.print(" matrix["+i+"]["+j+"] = "+ matrix[i][j]);
            }
            // System.out.println();
        }
    }
    public void transpose(int[][] matrix)
    {
        for(int i = 0 ; i < matrix.length; i++)
        {
            for(int j = i+1 ; j < matrix.length; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                 matrix[j][i] = temp;
            }
        }
    }
}