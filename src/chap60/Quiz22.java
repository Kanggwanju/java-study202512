package chap60;

class Static {
    public int a = 20;
    static int b = 0;
}

public class Quiz22 {
    public static void main(String[] args) {
        int a;
        a = 10;
        Static.b = a;

        Static st = new Static();

        System.out.println(Static.b++); // 10
        System.out.println(st.b);       // 11
        System.out.println(a);          // 10
        System.out.print(st.a);         // 20
    }
}
