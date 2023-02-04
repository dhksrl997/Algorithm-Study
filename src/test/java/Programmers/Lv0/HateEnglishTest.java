package Programmers.Lv0;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Created on 2023/02/04 5:04 PM In Intelli J IDEA 
by jeon-wangi
*/

class HateEnglishTest {

    @Test
    @DisplayName("영어가_싫어요_테스트")
    void 영어가_싫어요_테스트() {
        String[] inputs = new String[]{ "seventhreetwo", "ninesixsix", "twofournineninezero" };
        long[] answers = new long[]{ 732, 966, 24990 };

        HateEnglish hateEnglish = new HateEnglish();

        for (int i = 0; i < inputs.length; i++)
            Assertions.assertEquals(hateEnglish.solution(inputs[i]), answers[i]);
    }
}