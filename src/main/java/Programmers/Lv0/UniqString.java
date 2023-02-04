package Programmers.Lv0;
/*
Created on 2023/01/21 8:05 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/120896
// 한 번만 등장한 문자
public class UniqString {
    public static void main(String[] args) {
        System.out.println(new UniqString().solution("abcabcadc"));
    }

    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray())
            map.put(c, map.getOrDefault(c, 0) + 1);

        StringBuilder sb = new StringBuilder();
        List<Character> list = new ArrayList<>();
        for (char c : map.keySet())
            if (map.get(c) == 1) list.add(c);

        list.sort((o1, o2) -> o1 > o2 ? 1 : - 1);
        list.forEach(sb::append);

        return sb.toString();
    }
}
