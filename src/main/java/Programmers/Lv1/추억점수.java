package Programmers.Lv1;
/*
Created on 2023/04/09 3:04 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억점수 {
    public static void main(String[] args) {
        추억점수 main = new 추억점수();
        String[] name = { "may", "kein", "kain", "radi" };
        int[] yearning = { 5, 10, 1, 3 };
        String[][] photo = { { "may", "kein", "kain", "radi" }, { "may", "kein", "brin", "deny" }, {
                "kon", "kain", "may", "coni" } };
        System.out.println(Arrays.toString(main.solution(name, yearning, photo)));
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> score = new HashMap<>();

        for (int i = 0; i < name.length; i++)
            score.put(name[i], yearning[i]);

        for (int i = 0; i < photo.length; i++) {
            int total = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (score.containsKey(photo[i][j]))
                    total += score.get(photo[i][j]);
            }
            answer[i] = total;
        }
        return answer;
    }
}
