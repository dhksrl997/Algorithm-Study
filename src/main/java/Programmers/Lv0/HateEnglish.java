package Programmers.Lv0;
/*
Created on 2023/02/04 4:42 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.HashMap;
import java.util.Map;

//https://school.programmers.co.kr/learn/courses/30/lessons/120894
// 영어가 싫어요
public class HateEnglish {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
        System.out.println(new HateEnglish().solution(numbers));
    }

    public long solution(String numbers) {
        String answer = numbers;
        Map<String, String> mappingValue = getMappingValues();

        for (String s : mappingValue.keySet())
            if (answer.contains(s))
                answer = answer.replaceAll(s, mappingValue.get(s));

        return Long.parseLong(answer);
    }

    public Map<String, String> getMappingValues() {
        Map<String, String> map = new HashMap<>();
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        map.put("zero", "0");
        return map;
    }
}
