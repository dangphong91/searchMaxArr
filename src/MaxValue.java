import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int[] arr = creatArr();
        printArr(arr);
        System.out.println();
        int x = maxValue(arr);
        System.out.println(x);
    }
    public static int[] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i< size; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
    public static void printArr(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i =1; i< arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
