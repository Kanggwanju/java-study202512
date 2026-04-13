package chap60;

public class Quiz40 {
    public static void change(String[] data, String s) {
        data[0] = s; // 원본 배열의 0번 방을 B로 변경
        s = "Z";     // s는 change() 메서드 내에서만 유효한 지역 변수, 원본 s에는 영향 없음
    }

    public static void main(String[] args) {
        String data[] = { "A" };
        String s = "B";
        change(data, s);

        // 정답: BB
        System.out.println(data[0] + s);
    }
}
