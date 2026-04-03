package chap57;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        // String 타입만 담는 List 생성
        List<String> iveMembers = new ArrayList<>();
        
        // 데이터 추가: add()
        iveMembers.add("안유진");
        iveMembers.add("가을");
        iveMembers.add("레이");
        iveMembers.add("장원영");
        iveMembers.add("리즈");
        iveMembers.add("이서");

        System.out.println("현재 멤버: " + iveMembers);
        System.out.println("총 멤버 수: " + iveMembers.size() + "명");
    }
}
