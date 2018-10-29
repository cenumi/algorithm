package sword;

import java.util.ArrayList;

public class s19顺时针打印矩阵 {

    static int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
    };

    static int[][] matrix2 = {
            {1,2,3,4}
    };

    static int [][] matrix3 = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
    };
    /**
     * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
     * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
     * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
     */

    public static void main(String[] args) {
        new s19顺时针打印矩阵().printMatrix(matrix2);
    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();
        int ltx = 0;
        int lty = 0;
        int rbx = matrix.length - 1;
        int rby = matrix[0].length - 1;

        while (ltx <= rbx && lty <= rby){
            printEdge(matrix,ltx++,lty++,rbx--,rby--,arr);
        }

        return arr;
    }

    public void printEdge(int[][] matrix,int ltx,int lty,int rbx,int rby,ArrayList<Integer> arr){
        int px = ltx;
        int py = lty;
        if (ltx == rbx){
            while (lty <= rby) {
                arr.add(matrix[ltx][lty]);
                System.out.println(matrix[ltx][lty]);
                lty++;
            }
        }else if ( lty == rby){
            while (ltx <= rbx) {
                arr.add(matrix[ltx][lty]);
                System.out.println(matrix[ltx][lty]);
                ltx++;
            }
        }else {

            while (py < rby) {
                arr.add(matrix[ltx][py]);
                System.out.println(matrix[ltx][py]);
                py++;
            }

            while (px < rbx) {
                arr.add(matrix[px][rby]);
                System.out.println(matrix[px][rby]);
                px++;
            }

            while (py > lty) {
                arr.add(matrix[rbx][py]);
                System.out.println(matrix[rbx][py]);
                py--;
            }

            while (px > ltx) {
                arr.add(matrix[px][lty]);
                System.out.println(matrix[px][lty]);
                px--;
            }
        }

    }
}
