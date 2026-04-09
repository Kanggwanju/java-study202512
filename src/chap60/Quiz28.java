package chap60;

class classOne {
    int a, b;
    public classOne(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void print() {
        System.out.println(a + b);
    }
}

class classTwo extends classOne {
    int po = 3;
    public classTwo(int i) {
        super(i, i + 1);
    }

    @Override
    public void print() {
        System.out.println(po * po);
    }
}

public class Quiz28 {
    public static void main(String[] args) {
        classOne one = new classTwo(10);
        one.print();
        // 정답: 9
    }
}
