package chap60;
// 빈칸, 버블 정렬

public class Quiz24 {

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp; // 빈칸 1: idx2
    }

    public static void Usort(int[] array, int length) {
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] item = new int[] { 5, 3, 8, 1, 2, 7 };
        int nx = 6;
        Usort(item, nx); // 빈칸 2: nx

        for (int data : item) {
            System.out.print(data + " ");
        }
    }
}
