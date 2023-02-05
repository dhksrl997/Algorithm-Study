package Programmers.Lv0;

import java.util.Arrays;

/*
Created on 2023/02/05 3:12 PM In Intelli J IDEA 
by jeon-wangi
*/
//https://school.programmers.co.kr/learn/courses/30/lessons/120842
// 2차원 배열로 만들기
public class Lesson120842 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[][] my_answer = new Lesson120842().solution(arr, 2);
        System.out.println(Arrays.deepToString(my_answer));
    }

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int index = 0;
        for (int i = 0; i < answer.length; i++)
            for (int j = 0; j < n; j++)
                answer[i][j] = num_list[index++];

        return answer;
    }
}
