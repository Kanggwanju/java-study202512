package chap59;
// 클래스, 상속, 재귀
class Parent {
    public int compute(int num) {
        if (num <= 1) return num;
        return compute(num - 1) + compute(num - 2);
    }
}

class Child extends Parent {
    @Override
    public int compute(int num) {
        if (num <= 1) return num;
        return compute(num - 1) + compute(num - 3);
    }
}

public class Quiz6 {

    public static void main(String[] args) {
        Parent obj = new Child();
        // 정답: 1, Child의 compute(4) 실행
        System.out.println(obj.compute(4));
    }
}
