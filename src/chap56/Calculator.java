package chap56;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator { // 예외처리
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        try {

            // [try 블록]: 돌발 상황이 발생할 만한 '위험 지역'        
            System.out.print("나누어질 숫자를 입력하세요: ");
            int num1 = scanner.nextInt(); // InputMismatchException 발생 가능!
            System.out.print("나눌 숫자를 입력하세요: ");
            int num2 = scanner.nextInt(); // 여기서도 발생 가능!

            // 만약 사용자가 num2에 0을 입력하면?
            // 여기서 'ArithmeticException'이 발생!
            System.out.println("결과: " + (num1 / num2));

        } catch (ArithmeticException e) {

            // [catch 블록]: 산술 연산 예외 발생 시 작동하는 '안전 매트'
            // 0으로 나누는 사고
            System.out.println("앗! 0으로는 나눌 수 없어요.");
        } catch (InputMismatchException e) {

            // 문자를 입력하는 사고
            System.out.println("앗! 숫자가 아닌 문자를 입력했어요.");
        } finally {
            
            System.out.println("계산기를 정상적으로 종료합니다.");
        }

    }
}
