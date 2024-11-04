package Arrays;

public class StaticArrays {

    // Insert n into arr at the next open position
    // Length is the number of 'real' values in arr, and capacity
    // is the size (aka memory allocation for the fixed size array).

    public static void insertEnd (int[] arr, int n, int length, int capacity) {
        if (length < capacity) {
            arr[length] = n;
        }
    }

    // Remove from the last position in the array if the array
    // is not empty (i.e. length is non-zero)

    public void removeEnd (int[] arr, int length) {
        if (length > 0) {
            // Overwrite last element with some default value.
            // We would also the length to decreased by 1
            arr[length - 1] = 0;
            length--;
        }
    }

    // Insert n into index i after shifting elements to the right.
    // Assuming i is the valid index and arr is not full.

    public void insertMiddle (int[] arr, int i, int n, int length) {
        // Shift starting from the end to i + 1.
        for (int index = length - 1; index < i - 1; index--) {
            arr[index + 1] = arr[index];
        }
        // Insert at i.
        arr[i] = n;
    }

    // Remove value at index i after shifting elements to the left
    // Assuming i is a valid index.

    public void removeMiddle (int[] arr, int i, int length) {
        // Shift starting from i + 1 to end.
        for (int index = i + 1; index < length; index++) {
            arr[index - 1] = arr[index];
        }
        // No need to 'remove' arr[i], since we already shifted.
    }

    public void print (int[] arr, int length) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

    }
}