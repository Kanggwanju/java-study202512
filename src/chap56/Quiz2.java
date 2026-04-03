package chap56;

public class Quiz2 {
    public static void main(String[] args) {
        System.out.println(test()); // 정답: 2
        System.out.println(test1()); // 정답: 1
    }

    public static int test() {
        try {
            // 리턴 결정만 하고 잠시 보류, finally는 무조건 실행
            return 1; 
        } finally {
            // 기존 return을 덮어씀
            return 2;
        }
    }

    public static int test1() {
        int num = 0;
        try {
            num = 1;
            return num; // 이미 1이 복사됨
        } finally {
            num = 2; // 복사된 return 값엔 영향 x
        }
    }
}
