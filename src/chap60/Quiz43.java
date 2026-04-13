package chap60;

public class Quiz43 {
    public static class B0 {
        public int v;
        public B0(int v) { this.v = v; }
    }

    public static void main(String[] args) {
        B0 a = new B0(1);
        B0 b = new B0(2);
        B0 c = new B0(3);
        B0[] arr = {a, b, c};
        B0 t = arr[0]; // a
        arr[0] = arr[2]; // c b c
        arr[2] = t; // c b a
        arr[1].v = arr[0].v; // 3 3 1, c b a

        // 1a3b3c
        System.out.println(a.v + "a" + b.v + "b" + c.v + "c");
    }
}
