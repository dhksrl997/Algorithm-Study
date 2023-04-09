package Programmers.Lv1;
/*
Created on 2023/03/27 12:45 AM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.HashSet;
import java.util.Set;

public class 둘만의_암호 {
    public static void main(String[] args) {
        String answer = solution("aukks", "wbqd", 5);
        System.out.println("answer = " + answer);
    }

    private static String solution(String s, String skip, int index) {
        Set<Integer> skipChars = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char c : skip.toCharArray())
            skipChars.add(c - 'a');

        for (int i = 0; i < s.length(); i++) {
            int count = 1;
            int target = s.charAt(i) + 1 - 'a';
            while (count != index) {
                if (skipChars.contains(target)) {
                    target++;
                    continue;
                }
                target++;
                count++;
            }

            sb.append((char) ((target % ('z' - 'a')) + 'a'));
        }

        return sb.toString();
    }
}
