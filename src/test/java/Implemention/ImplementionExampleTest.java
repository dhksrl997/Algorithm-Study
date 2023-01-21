package Implemention;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Created on 2023/01/20 6:55 PM In Intelli J IDEA 
by jeon-wangi
*/

class ImplementionExampleTest {

    @Test
    void 구현_테스트() {
        ImplementionExample main = new ImplementionExample();
        Assertions.assertEquals(main.solution("1 + 10 + 2"), 13, () -> "테스트 실패");
        Assertions.assertNotEquals(main.solution("100 + 23 + 5"), 100, () -> "테스트 실패");
    }
}