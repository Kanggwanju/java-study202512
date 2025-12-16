package chap47;

public class Matrix {

    public static void main(String[] args) {

        // 2x3 2차원배열
        int[][] arr = new int[2][3];
        
        arr[0][0] = 10;
        arr[1][2] = 60;
        
        // 순회
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("arr[%d][%d] = %d\n", i, j, arr[i][j]);
            }
            System.out.println(); // 줄바꿈
        }

        for (int[] is : arr) {
            for (int n : is) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
