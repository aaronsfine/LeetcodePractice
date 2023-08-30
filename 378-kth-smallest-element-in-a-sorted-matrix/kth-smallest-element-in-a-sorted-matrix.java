class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        // int locLastChecked = 0;
        // List<Integer> list = new ArrayList<>();
        // Collections.addAll(list, matrix[0]);

        // for (int i = 1; i < matrix.length; i++) {
        //     if (list.size() >= k)
        //         break;
        //     if (matrix[i][0] > matrix[i-1][matrix[0].length - 1]) {
        //         Collections.addAll(list, matrix[i]);
        //         locLastChecked = list.size() - matrix[0].length;
        //         continue;
        //     }
            
            
            
        // }

        // return list.get(k-1);

        //super easy
        List<Integer> l = new ArrayList<>();
        for (int[] m : matrix) {
            for (int n : m) {
                l.add(n);
            }
        }
        Collections.sort(l);
        return l.get(k-1);
    }
}