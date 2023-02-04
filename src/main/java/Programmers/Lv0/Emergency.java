package Programmers.Lv0;
/*
Created on 2023/01/21 7:34 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//    https://school.programmers.co.kr/learn/courses/30/lessons/120835
// 진료 순서 정하기
public class Emergency {
    public static void main(String[] args) {
        int[] arr = { 3, 76, 24 };
        System.out.println(Arrays.toString(new Emergency().solution(arr)));
    }

    public int[] solution(int[] emergency) {
        int length = emergency.length;
        int[] answer = new int[length];
        int[] copied = Arrays.stream(Arrays.copyOf(emergency, length)).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();

        Map<Integer, Integer> index = new HashMap<>();

        for (int i = 0; i < length; i++) {
            index.put(copied[i], i);
        }

        int count = 0;

        for (int i = 0; i < length; i++) {
            answer[count] = index.get(emergency[i]) + 1;
            count++;
        }

        return answer;
    }
}
