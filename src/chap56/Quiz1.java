package chap56;

public class Quiz1 {
    
    public static void main(String[] args) {
        
        try {
            System.out.print("1");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("2");
        } finally {
            System.out.print("3");
        }
        System.out.println("4");
        // 정답: 1234
    }
}
