package PreFixSum.Quiz;
/*
Created on 2023/01/01 11:45 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baekjoon11441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[Integer.parseInt(br.readLine().trim())];
        String[] numbers = br.readLine().trim().split(" ");

        for (int i = 0; i < numbers.length; i++)
            array[i] = Integer.parseInt(numbers[i]);

        int[] prefixSum = new int[array.length + 1];
        for (int i = 1; i < prefixSum.length; i++)
            prefixSum[i] = array[i - 1] + prefixSum[i - 1];

        int length = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            String[] range = br.readLine().trim().split(" ");
            int start = Integer.parseInt(range[0]);
            int end = Integer.parseInt(range[1]);
            sb.append(prefixSum[end] - prefixSum[start - 1]);
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
