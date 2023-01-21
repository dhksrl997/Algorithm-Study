package Common;
/*
Created on 2023/01/21 7:23 PM In Intelli J IDEA 
by jeon-wangi
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {
    @Test
    @DisplayName("배열 복사 테스트")
    void ArrayCopyTest() {
        int[] arr = { 3, 10, 5 };
        int[] copied = Arrays.copyOf(arr, arr.length);
        Assertions.assertEquals(Arrays.toString(arr), Arrays.toString(copied));
    }
}
