package PreFixSum;
/*
Created on 2022/12/27 9:42 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.Arrays;

public class PreFixSumExample {
    public static void main(String[] args) {
        int[] arr = { 7, 6, 3, 2, 1 };
        System.out.println(new PreFixSumExample().sum(arr, 0, 3));
    }

    public int sum(int[] array, int start, int end) {
        int[] prefixSum = new int[array.length + 1];
        for (int i = 1; i < prefixSum.length; i++)
            prefixSum[i] = prefixSum[i - 1] + array[i - 1];
        return prefixSum[end] - prefixSum[Math.max(start - 1, 0)];
    }
}
