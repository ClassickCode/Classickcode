// We are gonna use toStirng method in this!!!!!!

import java.util.Arrays;

public class SwappingNumInArrays {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        swaparrrays(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

    }

    static void swaparrrays(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

// ============================================================================================

// About toString method!!!!!!!!!!!!!!!!!

/*
 * This method is useful when you want to display
 * the contents of an array as a
 * string, such as when debugging or logging.
 * It converts each element of the array to a
 * string and joins them together
 * with a separator.
 */

// ==============================================================================================
// Examples!!!!

/*
 * int[] arr = {1,2,3,4,5};
 * System.out.println(Arrays.toString(arr));
 * 
 * Output:
 * [1,2,3,4,5]
 */
// ===============================================================================================
