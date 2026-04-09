package chap60;

public class Quiz31 {
    public static void main(String[] args) {
        String str = "abacabcd";
        boolean[] seen = new boolean[256];

        // 정답: dcba
        System.out.print(calculFn(str, str.length() - 1, seen));
    }

    public static String calculFn(String str, int index, boolean[] seen) {
        if (index < 0) return "";

        // char 타입(단일 문자)은 내부적으로 '숫자(정수)'로 취급
        char c = str.charAt(index); // 'a': 97, 'A': 65

        String result = calculFn(str, index - 1, seen);

        if (!seen[c]) {
            seen[c] = true;
            return c + result;
        }
        return result;
    }
}
