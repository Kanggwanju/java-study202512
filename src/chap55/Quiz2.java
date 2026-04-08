package chap55;

public class Quiz2 {

    public static void main(String[] args) {
        String str = "Java";
        str.toUpperCase(); // 변경 x
        str.replace("a", "o"); // 변경 x짐
        str.substring(1); // 변경 x
        System.out.println("최종 결과: " + str); // "Java"

        StringBuilder sb = new StringBuilder("Java");

        sb.append("!!!");     // 바로 변경됨, "Java!!!"
        sb.replace(1, 2, "o"); // 바로 변경됨, "Jova!!!"

        System.out.println(sb); // 바뀐 값 출력
    }
}
