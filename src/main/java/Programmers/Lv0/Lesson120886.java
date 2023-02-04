package Programmers.Lv0;
/*
Created on 2023/02/04 6:13 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

//https://school.programmers.co.kr/learn/courses/30/lessons/120886
// A로 B만들기
public class Lesson120886 {
    public static void main(String[] args) {
        System.out.println(new Lesson120886().solution("olleh", "hello") == 1);
    }

    public int solution(String before, String after) {
        Map<Character, Integer> aMap = new HashMap<>();
        Map<Character, Integer> bMap = new HashMap<>();

        for (char c : before.toCharArray())
            aMap.put(c, aMap.getOrDefault(c, 0) + 1);

        for (char c : after.toCharArray()) {
            if (! aMap.containsKey(c))
                return 0;
            bMap.put(c, bMap.getOrDefault(c, 0) + 1);
        }

        for (char c : aMap.keySet())
            if (! Objects.equals(aMap.get(c), bMap.get(c)))
                return 0;

        return 1;
    }
}
