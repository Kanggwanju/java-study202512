package chap60;

public class Quiz26 {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");

        System.out.println(str1 == str2);      // true, 같은 주소
        System.out.println(str1 == str3);      // false, 다른 주소
        System.out.println(str1.equals(str3)); // true, 같은 값
        System.out.print(str2.equals(str3));   // true, 같은 값
    }
}
