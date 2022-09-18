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
    public String moodCheck(){
        try {
            if (message.contains("SAD"))
            {
                return "SAD";
            }
            else{
                return "HAPPY";
            }
        }
        catch(Exception exception){
            return "HAPPY";
        }
    }


}
