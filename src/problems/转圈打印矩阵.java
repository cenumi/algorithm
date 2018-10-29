package problems;

public class 转圈打印矩阵 {
    private static int[][] matrix = new int[][]{
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16},
            {17,18,19,20}
    };
    static int[][] matrix2 = {
            {1,2},{3,4}
    };
    static int [][] matrix3 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
    };
    /**
     * 给定一个整型矩阵 matrix ，请按照转圈的方式打印它。
     * 打印结果为：
     * 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
     * 额外空间复杂度为O(1)。
     */
    public static void main(String[] args) {
        print(matrix3);
    }

    public static void print(int[][] matrix){
        int ti = 0;
        int tj = 0;

        int bi = matrix.length-1;
        int bj = matrix[0].length-1;

        while (ti <= bi && tj <= bj){
            printEdge(matrix,ti++,tj++,bi--,bj--);
        }

    }

    private static void printEdge(int[][] matrix,int ti,int tj,int bi,int bj){
//        tj = tj - 1;
//        ti = ti - 1;
        int pi = ti;
        int pj = tj;
        while (pj < bj){
            System.out.println(matrix[ti][pj]);
            pj++;
        }


        while(pi < bi){
            System.out.println(matrix[pi][bj]);
            pi++;
        }


        while (pj > tj){
            System.out.println(matrix[bi][pj]);
            pj--;

        }


        while (pi > ti){
            System.out.println(matrix[pi][tj]);
            pi--;

        }
    }
}
