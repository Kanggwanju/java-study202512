package chap59;
// 2차원 배열
public class Quiz10 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{45, 50, 75}, {89}};

        System.out.println(arr[0].length); // 3
        System.out.println(arr[1].length); // 1
        System.out.println(arr[0][0]);     // 45
        System.out.println(arr[0][1]);     // 50
        System.out.println(arr[1][0]);     // 89
    }
}
