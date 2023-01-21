package PreFixSum.Quiz;
/*
Created on 2023/01/20 7:02 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] query = br.readLine().split(" ");
        int length = Integer.parseInt(query[0]);
        int target = Integer.parseInt(query[1]);

        String[] nums = br.readLine().split(" ");
        long[] sum = new long[length + 1];
        long[] cnt = new long[target];

        int answer = 0;
        for (int i = 1; i <= length; i++) {
            sum[i] = (sum[i - 1] + Integer.parseInt(nums[i - 1])) % target;
            if (sum[i] == 0) {
                answer++;
            }
            cnt[(int) sum[i]]++;
        }
    }
}
