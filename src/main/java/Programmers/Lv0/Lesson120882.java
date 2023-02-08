package Programmers.Lv0;
/*
Created on 2023/02/08 8:00 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/120882
// 등수 매기기
public class Lesson120882 {
    public static void main(String[] args) {
        int[][] arr = { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } };
        int[][] arr2 = { { 80, 70 }, { 70, 80 }, { 30, 50 }, { 90, 100 }, { 100, 90 }, { 100, 100 }, { 10, 30 } };
//        System.out.println(Arrays.toString(new Lesson120882().solution(arr)));
        System.out.println(Arrays.toString(new Lesson120882().solution(arr2)));
    }

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        for (int[] i : score)
            list.add(i[0] + i[1]);

        list.sort(Collections.reverseOrder());

        int index = 0;
        list.forEach(System.out::println);
        for (int[] i : score)
            answer[index++] = list.indexOf(i[0] + i[1]) + 1;

        return answer;
    }
}
