package chap47;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {

        // 1. 배열 변수의 선언
        int[] arr; // 참조 변수, 주소 조작 불가능
        // 2. 배열 객체 생성
        arr = new int[5];

        System.out.println("arr: " + arr); // 해시코드

        // 3. 배열 초기화
        arr[0] = 99;
        arr[1] = arr[0] + 10;
        arr[2] = (int) 50.5;
        arr[3] = 5;
        arr[4] = arr[1] + arr[2];
//        arr[99] = 11;

        // 4. 배열 값 참조
        System.out.println("arr[0]의 값: " + arr[0]);

        // 5. 배열에 저장된 전체값 보기
        System.out.println(Arrays.toString(arr));

        // 6. 자바의 배열은 만들기만 하고 냅두면
        //    알아서 빈칸을 채운다.
        int[] intArr = new int[4];
        System.out.println(Arrays.toString(intArr));
        double[] dArr = new double[6];
        System.out.println(Arrays.toString(dArr));
        boolean[] bArr = new boolean[3];
        System.out.println(Arrays.toString(bArr));
        String[] sArr = new String[5];
        System.out.println(Arrays.toString(sArr));

        int[] numbers = {10, 20, 30, 40};
        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("numbers의 개수: " + numbers.length);

    }
}
