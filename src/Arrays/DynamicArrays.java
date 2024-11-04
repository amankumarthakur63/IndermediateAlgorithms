package Arrays;

public class DynamicArrays {
    int capacity;
    int length;
    int[] arr;

    public DynamicArrays () {
        capacity = 2;
        length = 0;
        arr = new int[2];
    }

    // Insert n in the last position of the array

    public void pushback (int n) {
        if (length == capacity) {
            this.resize();
        }

        // insert at the next empty position

        arr[length] = n;
        length++;
    }

    public void resize () {
        // Create new array of double capacity
        capacity = 2 * capacity;
        int[] newArr = new int [capacity];

        // Copy elements to newArr
        for (int i = 0; i < length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


    public static void main(String[] args) {

    }
}
