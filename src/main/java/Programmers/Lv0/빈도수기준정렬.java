package Programmers.Lv0;
/*
Created on 2023/02/04 5:40 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.*;

public class 빈도수기준정렬 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 2, 3, 3, 100, 100, 100, 100, 23, 24, 24, 24, 24 };
        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : array)
            map.put(i, map.getOrDefault(i, 0) + 1);

        return map.keySet().stream().sorted((o1, o2) -> {
            if (map.get(o1) > map.get(o2)) return - 1;
            if (Objects.equals(map.get(o1), map.get(o2))) return o1 > o2 ? 1 : - 1;
            return 1;
        }).mapToInt(i -> i).toArray();
    }
}
