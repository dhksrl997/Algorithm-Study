package Programmers.Lv0;
/*
Created on 2023/01/06 1:06 AM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        System.out.println(new RemoveDuplicateString().solution("We are the world"));
    }

    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        char[] chars = my_string.toCharArray();
        for (char c : chars) {
            if (! set.contains(c)) {
                set.add(c);
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
