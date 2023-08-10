class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;

        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }
        
        for (int i = 0; i < matrix.length; i++) {
            if (target <= matrix[i][matrix[0].length - 1]) {
                row = i;
                break;
            }
        }

        System.out.println("Got to row with info " + Arrays.toString(matrix[row]));
        for (int i = 0; i < matrix[0].length; i++) {
            if (target == matrix[row][i])
                return true;
        }

        return false;
    }
}