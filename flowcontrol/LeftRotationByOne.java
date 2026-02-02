package Arrays;

public class LeftRotationByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        leftRotateByOne(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void leftRotateByOne(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int firstElement = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = firstElement;
    }
}
