package chap55;

public class Quiz1 {

    public static void main(String[] args) {
        
        String text =  " Hello World ";
        String result1 = text.trim(); // "Hello World"
        String result2 = result1.substring(6); // "World"
        String result3 = result2.toUpperCase(); // "WORLD"
        System.out.println("원본: '" + text + "'");
        System.out.println("결과: '" + result3 + "'");
        System.out.println("길이: " + result3.length());
    }
}
