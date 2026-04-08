package chap59;
// switch, fall-through
public class Quiz18 {

    public static void main(String[] args) {
        int i = 3;
        int k = 1;

        switch (i) {
            case 1: k += 1;
            case 2: k++;
            case 3: k = 0;
            case 4: k += 3;
            case 5: k -= 10;
            default: k--;
        }
        // 정답: -8
        System.out.print(k);
    }
}
