package Programmers.Lv1;
/*
Created on 2023/02/05 4:26 PM In Intelli J IDEA 
by jeon-wangi
*/

//https://school.programmers.co.kr/learn/courses/30/lessons/140108
// 문자열 나누기
public class Lesson140108 {
    public static void main(String[] args) {
        String s = "abracadabra";
        int answer = new Lesson140108().solution(s);
        System.out.println(answer);
    }

    public int solution(String s) {
        String origin = s;
        int answer = 0;
        while (s.length() > 1) {
            char first = s.charAt(0);
            int same = 0, other = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == first)
                    same++;
                else
                    other++;

                if (same == other) {
                    s = s.substring(i + 1);
                    answer++;
                    break;
                }
            }
        }
        return answer + s.length();
    }
}
