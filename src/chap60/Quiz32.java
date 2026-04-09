package chap60;

import java.util.Arrays;

public class Quiz32 {
    public static void main(String[] args) {
        String str = "ITISTESTSTRING";

        // T를 기준으로 나눠서 배열에 넣음
        // [I, IS, ES, S, RING]
        String[] result = str.split("T");

        // 정답: S
        System.out.println(result[3]);
    }
}
