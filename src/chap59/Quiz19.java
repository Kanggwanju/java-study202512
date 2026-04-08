package chap59;

public class Quiz19 {
    static int[] MakeArray() {
        int[] tempArr = new int[4];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = i;
        }
        return tempArr;
    }

    public static void main(String[] args) {
        int[] intArr;
        intArr = MakeArray();
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i]);// 정답: 0123
        }
    }
}
