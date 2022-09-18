package com.bridgelabz;

public class MoodAnalyzer {
   String message;

   // creating constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    /*
    creating method to check mood by passing string type message parameter
    try and catch blocks will be used for exception handling
     */
    public String moodCheck() throws MoodAnalysisException {
        try {
            if (message.contains("SAD"))
            {
                return "SAD";
            }
            else if (message.contains("HAPPY")){
                return "HAPPY";
            }
            else if(message.contains("")){
                throw new MoodAnalysisException(NullMoodErrors.EMPTYMOOD,"Invalid Mood ! ");
            }
            else{
                return "HAPPY";
            }
        }
        catch(Exception exception){
            throw new MoodAnalysisException(NullMoodErrors.NULLMOOD,"Please enter mood ! ");
        }
    }


}
