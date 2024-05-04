// How to reverse the elements in Array!

// 1: Swap the start index and the end index.
// 2: Then ++ the start means increase the index of start after every swap!
// 3: Then -- the end means decrease the index of end after every swap in 2 Num.
// 4: Put condition that : swap till (start < end)

import java.util.Arrays;

public class reversearrays {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };

        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void reverse(int[] arr) {
        int start = 0; // index
        int end = arr.length - 1; // index

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}