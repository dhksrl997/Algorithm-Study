package Implemention;

/*
Created on 2023/01/12 10:19 PM In Intelli J IDEA 
by jeon-wangi
*/
// https://school.programmers.co.kr/learn/courses/30/lessons/120902
public class ImplementionExample {
    public static void main(String[] args) {
        System.out.println(new ImplementionExample().solution("1 + 5 + 3"));
    }

    /*
    - 연산자는 +, -만 존재합니다.
    - 문자열의 시작과 끝에는 공백이 없습니다.
    - 0으로 시작하는 숫자는 주어지지 않습니다.
    - 잘못된 수식은 주어지지 않습니다.
    - 5 ≤ my_string의 길이 ≤ 100
    - my_string을 계산한 결과값은 1 이상 100,000 이하입니다.
        - my_string의 중간 계산 값은 -100,000 이상 100,000 이하입니다.
        - 계산에 사용하는 숫자는 1 이상 20,000 이하인 자연수입니다.
        - my_string에는 연산자가 적어도 하나 포함되어 있습니다.
    - return type 은 정수형입니다.
    - my_string의 숫자와 연산자는 공백 하나로 구분되어 있습니다.
    */
    public int solution(String my_string) {
        int answer = 0;
        String[] nums = my_string.split(" ");
        boolean add = true;
        for (String s : nums) {
            if (s.equals("+") || s.equals("-")) {
                add = s.equals("+");
                continue;
            }

            if (add)
                answer += Integer.parseInt(s);
            else
                answer -= Integer.parseInt(s);
        }
        return answer;
    }
}
