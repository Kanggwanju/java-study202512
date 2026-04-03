package chap56;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionThrowsStudy {

    public static void readFile() throws IOException {
        System.out.println("파일을 읽습니다...");
        FileReader reader = new FileReader("a.txt");
        // a.txt 파일이 없으면 여기서 사고 발생!
        System.out.println("파일 읽기 성공!");
    }

    public static void main(String[] args) {
        
        // readFile(); // -> 그냥 호출하면 컴파일 에러

        try {
            // 호출하는 쪽에서 try-catch로 대비책 마련
            readFile();
        } catch (IOException e) {
            System.out.println("파일을 읽는 도중 문제가 발생했습니다!");
        }
    }
}
