package Week8;

import java.util.Arrays;

public class Array_N_UniqueIntegersEqualsTo0 {

    /*
Write a function:
that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0. The function
can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5]. The answer [1, -
1,1,3] would be incorrect (because value 1 occurs twice). For N = 3 one of the possible answers is [-1,0,1] (but there are
many more correct answers).
     */

    public static int[] uniqueArrWithNIntegers(int N){
        int[] arr = new int[N];
        int dummy = 0, sum = 0;

        while (N > 1){
            arr[--N] = dummy++;
            sum += arr[N];
        }
        arr[0] = -1 * sum;

        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(uniqueArrWithNIntegers(4)));
        System.out.println(Arrays.toString(uniqueArrWithNIntegers(10)));
    }

}
