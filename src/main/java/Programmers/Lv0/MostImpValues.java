package Programmers.Lv0;

import java.util.HashMap;
import java.util.Map;

/*
Created on 2023/01/26 9:14 PM In Intelli J IDEA 
by jeon-wangi
*/
//https://school.programmers.co.kr/learn/courses/30/lessons/120812
public class MostImpValues {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 3, 4 };
        System.out.println(new MostImpValues().solution(arr));
    }

    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array)
            map.put(i, map.getOrDefault(i, 0) + 1);

        int max = 0;
        for (int i : map.keySet()) {
            if (map.get(i) > max) {
                answer = i;
                max = map.get(i);
            }
        }

        int count = 0;
        for (int i : map.keySet()) {
            if (max == map.get(i))
                count++;

            if (count > 1) return - 1;
        }

        return answer;
    }
}
