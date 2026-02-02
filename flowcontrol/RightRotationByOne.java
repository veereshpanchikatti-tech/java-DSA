package Arrays;

public class RightRotationByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        rightRotateByOne(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rightRotateByOne(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        int lastElement = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = lastElement;
    }
}
