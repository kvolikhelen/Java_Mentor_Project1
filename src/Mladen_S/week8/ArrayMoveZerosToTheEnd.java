package Mladen_S.week8;

public class ArrayMoveZerosToTheEnd {

    /*
    Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
Ex:
input: {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]


    // function to move all zeroes at
// the end of array
*/

    static void ArrayMoveZerosToTheEnd(int arr[], int n) {

        // Count of non-zero elements
        int count = 0;

        // Traverse the array. If arr[i] is non-zero, then
        // update the value of arr at index count to arr[i]
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        // Update all elements at index >=count with value 0
        for (int i = count; i<n;i++)
            arr[i]=0;
    }

    // function to print the array elements
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above
    public static void main(String args[]) {
        int[] arr = {1,0,2,0,3,0,4,0};
        int n = arr.length;

        System.out.print("Original array: ");
        printArray(arr, n);

        ArrayMoveZerosToTheEnd(arr, n);

        System.out.print("\nModified array: ");
        printArray(arr, n);
    }
}




