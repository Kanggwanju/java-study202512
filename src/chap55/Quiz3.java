package chap55;

public class Quiz3 {

    public static void main(String[] args) {
        
        String s1 = "BTS";
        String s2 = "BTS";
        String s3 = new String("BTS");
        String s4 = s3.intern();
        System.out.println("s1 == s2: " + (s1 == s2));       // true
        System.out.println("s1 == s3: " + (s1 == s3));       // false
        System.out.println("s1 == s4: " + (s1 == s4));       // ?
        System.out.println("s1.equals(s3)" + s1.equals(s3)); // true
        String s5 = null;
        System.out.println("s1.equals(s5)" + s1.equals(s5)); // false
        System.out.println("s5.equals(s1)" + (s5 != null && s5.equals(s1))); // false, s5.equals(s1)만 있으면 null포인터참조
    }
}
