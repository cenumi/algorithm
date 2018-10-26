package problems;

public class 旋转矩阵 {

    private static int[][] matrix = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };
    /**
     * 一个正方形矩阵，输出顺时针转 90 度之后的矩阵
     * 额外空间复杂度 O（1）
     */


    public static void main(String[] args) {
        rotate(matrix);
    }


    public static void rotate(int[][] matrix){
        int ti = 0;
        int tj = 0;
        int bi = matrix.length - 1;
        int bj = matrix[0].length - 1;
        while (ti<bi)
            rotateEdge(matrix,ti++,tj++,bi--,bj--);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotateEdge(int[][] matrix,int ti,int tj,int bi,int bj){
        int len = bj - tj;

        for (int i = 0; i < len; i++) {
            int tmp = matrix[ti][tj+i];
            matrix[ti][tj+i] = matrix[bi-i][tj];
            matrix[bi-i][tj] = matrix[bi][bj-i];
            matrix[bi][bj-i] = matrix[ti+i][bj];
            matrix[ti+i][bj] = tmp;
        }

    }
}
