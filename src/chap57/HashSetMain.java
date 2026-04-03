package chap57;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {
        
        // Set 인터페이스
        // 1. 데이터 중복 허용 x
        // 2. 데이터를 넣은 순서 기억 x 

        // 로또 번호 저장용 Set
        Set<Integer> lottoNumbers = new HashSet<>();

        // 데이터 추가
        lottoNumbers.add(7);
        lottoNumbers.add(13);
        lottoNumbers.add(25);
        lottoNumbers.add(7); // 무시됨 !
        lottoNumbers.add(42);

        System.out.println("추천 번호: " + lottoNumbers);
        System.out.println("개수: " + lottoNumbers.size());

        // 포함 여부 확인
        if (lottoNumbers.contains(25)) {
            System.out.println("25는 행운의 숫자");
        }

    }
}
