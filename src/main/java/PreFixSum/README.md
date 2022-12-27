# 누적합 (PrefixSum)

- 누적합이란?
    - 배열 int[] array가 있을 때, 이 배열에 대해 구간의 합.

---

```
// 배열 전체의 합
public int sum(int[] array){
    int sum = 0;
    for(int i : array)
      sum += i;
      
    return sum; 
}

//배열 구간의 합
public int sum(int[] array, int start, int end){
    int sum = 0;
    for(int i = start ; i<= end; i++){
      sum += array[i];
    }
    return sum; 
}
```

> 위와 같이 사용할 수 있지만, 배열의 크기가 10만이 넘어간다면
> array의 길이 M, sum() 함수의 호출 횟수 N일 때 O(MN)으로
> 시간은 약 100초가 소요.(보통 1억번의 시간복잡도를 1초로 잡는다.)

**누적합**의 개념을 이용한다면 특정 인덱스까지의 합을 지정해두고 빠르게 구할 수 있다.

<p>
    <img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F9951294A5DF6250826" alt>
    <em>
      <a href="https://jow1025.tistory.com/47">이미지 출처</a>
    </em>
</p>

인자로 받은 배열과 같은 크기의 배열을 만들고 해당 인덱스까지의 누적합을 할당한다.

위 이미지에서 1부터 4까지의 누적합을 구한다면

```
int start  = 2;
int end = 4;
return prefixSum[end] - prefixSum[start - 1]; 
```

의 형태로 빠르게 구할 수 있다.
<br/>
<br/>
<br/>
예를 들어
<br/>
![](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fbgovxr%2FbtrUGq5U2OW%2FiFYbGK8nA1XGKoqoJqNm50%2Fimg.png)
<br/>
이미지 상의 빨간 부분은 불필요 부분이고

초록색으로 된 부분까지의 합 - 파란색 부분까지의 합을 이용하는 개념이다.


---
- [예시 코드](https://github.com/dhksrl997/Algorithm-study/blob/main/src/main/java/PreFixSum/PreFixSumExample.java)


#### 연관 문제

- [백준 - 합 구하기](https://www.acmicpc.net/problem/11441)
- [구간 합 구하기 4](https://www.acmicpc.net/problem/11659)

<br/>

#### 참고 자료 :

- [누적합(prefix sum)](https://jow1025.tistory.com/47)
- [누적 합(prefix sum), 2차원 누적합(prefix sum of matrix) with java](https://nahwasa.com/entry/%EB%88%84%EC%A0%81-%ED%95%A9prefix-sum-2%EC%B0%A8%EC%9B%90-%EB%88%84%EC%A0%81%ED%95%A9prefix-sum-of-matrix-with-java)
- [[알고리즘] 누적합 prefix sum](https://kjs-dev.tistory.com/entry/%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98-%EB%88%84%EC%A0%81%ED%95%A9-prefix-sum)
