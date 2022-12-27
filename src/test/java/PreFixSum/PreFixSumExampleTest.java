package PreFixSum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Created on 2022/12/27 11:19 PM In Intelli J IDEA 
by jeon-wangi
*/

class PreFixSumExampleTest {

    @Test
    @DisplayName("누적합 테스트")
    void prefixSumTest() {
        PreFixSumExample example = new PreFixSumExample();
        int[] arr = { 7, 6, 3, 2, 1 };
        int start = 0;
        int end = 3;
        Assertions.assertEquals(example.sum(arr, start, end), 16, () -> "fail");
    }
}