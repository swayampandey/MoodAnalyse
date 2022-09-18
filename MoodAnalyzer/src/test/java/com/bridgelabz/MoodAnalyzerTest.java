package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest {

    @Test
    public void if_MessageWasSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer =new MoodAnalyzer("This is SAD message");
        String message = moodAnalyzer.moodCheck();
        Assertions.assertEquals("SAD", message);
    }
    @Test
    public void if_MessageWasHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("This is HAPPY message");
        String message = moodAnalyzer.moodCheck();
        Assertions.assertEquals("HAPPY",message);
    }
    @Test
    public void ifMessageWasNull_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
        String message = moodAnalyzer.moodCheck();
        Assertions.assertEquals("HAPPY",message);
    }
    @Test
    public void ifMessageWasEmpty_ShouldReturnHappy() throws MoodAnalysisException{
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
        String message = moodAnalyzer.moodCheck();
        Assertions.assertEquals(NullMoodErrors.NULLMOOD,message);
    }



}
