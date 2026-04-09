package chap60;

public class Quiz33 {
    static String[]s = new String[3];

    static void func(String[] s, int size) {
        for (int i = 1; i < size; i++) {
            if (s[i - 1].equals(s[i])) {
                System.out.print("O");
            } else {
                System.out.print("N");
            }
        }
        for (String m : s) {
            System.out.print(m);
        }
    }

    public static void main(String[] args) {
        s[0] = "A";
        s[1] = "A";
        s[2] = new String("A");
        func(s, 3);
        // 정답: OOAAA
    }
}
