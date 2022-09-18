package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void if_MessageWasSad_ShouldReturnSad(){
        MoodAnalyzer moodAnalyzer =new MoodAnalyzer("This is SAD message");
        String message = moodAnalyzer.moodCheck();
        Assertions.assertEquals("SAD", message);
    }
    @Test
    public void if_MessageWasHappy_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is HAPPY message");
        String message = moodAnalyzer.moodCheck();
        Assertions.assertEquals("HAPPY",message);
    }
    @Test
    public void ifMessageWasNull_ShouldReturnHappy(){
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String message = moodAnalyzer.moodCheck();
        Assertions.assertEquals("HAPPY",message);
    }



}
