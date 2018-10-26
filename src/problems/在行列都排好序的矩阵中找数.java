package problems;

public class 在行列都排好序的矩阵中找数 {
    private static int[][] matrix = new int[][]{
            {0,1,2,5},
            {2,3,4,7},
            {4,4,4,8},
            {5,7,7,9}
    };
    /**
     * 给定一个有 N*M 的整型矩阵 matrix 和一个整数 k
     * matrix 的每一行和每一列都是排好序的。
     * 实现一个函数，判断 K 是否在 matrix 中。
     * 例如上述 如果 k 为 7，返回 true，如果 k 为 6，返回 false
     * 要求 时间复杂度为 O(M+N) ,额外空间复杂度为 O(1)
     */

    public static void main(String[] args) {
        System.out.println(search(matrix,7));

    }

    public static boolean search(int[][] matrix,int k){
        int width = matrix[0].length - 1;
        int height = matrix.length - 1;
        int i = height;
        int j = 0;
        boolean res = false;
        while (i >= 0 && j<=width){
            if (matrix[i][j] > k){
                i--;
            }else if (matrix[i][j] < k){
                j++;
            }else if (matrix[i][j] == k){
                res = true;
                break;
            }
        }
        return res;
    }
}
