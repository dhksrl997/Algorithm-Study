package Programmers.Lv0;
/*
Created on 2023/02/04 5:11 PM In Intelli J IDEA 
by jeon-wangi
*/

//https://school.programmers.co.kr/learn/courses/30/lessons/120885
// 이진수 더하기
public class Lesson120885 {
    public static void main(String[] args) {
        System.out.println(new Lesson120885().solution("10", "11").equals("101"));
    }

    public String solution(String bin1, String bin2) {
        int sum = Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2);
        return Integer.toBinaryString(sum);
    }
}
