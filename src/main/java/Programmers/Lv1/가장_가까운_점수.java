package Programmers.Lv1;
/*
Created on 2023/04/09 3:29 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.*;

public class 가장_가까운_점수 {
    public static void main(String[] args) {
        가장_가까운_점수 main = new 가장_가까운_점수();
        System.out.println(Arrays.toString(main.solution("banana")));
    }

    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<Character, List<Integer>> maps = new HashMap<>();

        char[] arr = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> index = maps.get(arr[i]);
            if (index == null) {
                index = new ArrayList<>();
                index.add(i + 1);
                answer[i] = - 1;
            } else {
                answer[i] = (i + 1) - index.get(index.size() - 1);
                index.add(i + 1);
            }
            maps.put(arr[i], index);
        }

        return answer;
    }
}
