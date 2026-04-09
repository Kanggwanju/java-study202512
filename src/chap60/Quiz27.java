package chap60;
// 호출 순서 고르기

class Parent2 {
    int x, y;
    Parent2(int x, int y) { /* 1 */
        this.x =  x;
        this.y = y;
    }
    int getT() { /* 2 */
        return x * y;
    }
}
class Child2 extends Parent2 {
    int x;
    Child2(int x) { /* 3 */
        super(x + 1, x);
        this.x = x;
    }
    int getT(int n) { /* 4 */
        return super.getT() + n;
    }
}

public class Quiz27 {
    public static void main(String[] args) { /* 5 */
        Parent2 parent = new Child2(3);   /* 6 */
        System.out.println(parent.getT());   /* 7 */
        
        // 정답: 5 - 6 - 3 - 1 - 7 - 2
        
    }
}
