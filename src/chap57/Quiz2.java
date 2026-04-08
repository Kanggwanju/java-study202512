package chap57;

import java.util.HashMap;
import java.util.Map;

public class Quiz2 {
    public static void main(String[] args) {
        
        Map<String, Integer> userPoints = new HashMap<>();
        userPoints.put("Alice", 150);
        userPoints.put("Bob", 200);
        userPoints.put("Charlie", 120);

        // 답: 200 + 3 = 203
        System.out.println(userPoints.get("Bob") + userPoints.size());
    }
}
