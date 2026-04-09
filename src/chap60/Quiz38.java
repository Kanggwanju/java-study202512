package chap60;
class Parent3 {
    static int total = 0;
    int v = 1;
    public Parent3() {
        total += (++v);
        show(); // Child3의 show()를 호출, 자식의 메서드가 우선권을 가짐
    }
    public void show() { total += total; }
}
class Child3 extends Parent3 {
    int v = 10;
    
    public Child3() {
        // super(); 생략되어있음
        v += 2;
        total += v++;
        show();
    }
    
    @Override
    public void show() { total += total * 2; }
}
public class Quiz38 {
    public static void main(String[] args) {
        new Child3();
        // 정답: 54
        System.out.println(Parent3.total);
    }
}
