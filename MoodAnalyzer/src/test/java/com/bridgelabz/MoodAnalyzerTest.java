package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {
    MoodAnalyzer moodAnalyze = new MoodAnalyzer();

    @Test
    public void if_MessageWasSad_ShouldReturnSad(){
        String message = " I am in HAPPY mood ";
        String mood = moodAnalyze.moodCheck(message);
        Assertions.assertEquals("HAPPY", mood);
    }

}
