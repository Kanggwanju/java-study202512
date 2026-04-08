package chap57;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {
    public static void main(String[] args) {
        
        // Map 인터페이스
        // 이름표(Key)와 물건(Value)을 하나의 쌍으로 저장
        // Key는 중복 불가
        
        // HashMap
        // 1. 순서 보장 x
        // 2. Key로 Value를 매우 빠르게 찾음

        // 영단어 사전 만들기
        Map<String, String> dictionary = new HashMap<>();

        // 데이터 추가: put(Key, Value)
        dictionary.put("apple", "사과");
        dictionary.put("banana", "바나나");
        dictionary.put("code", "코드");

        // 데이터 조회: get(Key)
        String meaning = dictionary.get("apple");
        System.out.println("apple의 뜻: " + meaning);

        // 데이터 수정: 같은 Key로 다시 put
        dictionary.put("code", "프로그래밍 코드, 암호");

    }
}
