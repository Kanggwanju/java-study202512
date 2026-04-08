package chap59;
// 빈칸 채우기, 이차원배열

public class Quiz7 {

    public static void main(String[] args) {
        int[][] a = new int[3][5]; // 빈칸 3, 5, 행 개수 x 열 개수 형태로 선언됨

        /*
            출력결과:
            1 4 7 10 13
            2 5 8 11 14
            3 6 9 12 15
         */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = j * 3 + (i + 1);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
