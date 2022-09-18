package com.bridgelabz;

public class MoodAnalyzer {
   String message;

   // creating constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String moodCheck(){
        if(message.contains("SAD")){
            System.out.println("In sad mood");
            return "SAD";
        }
        else{
            System.out.println("In happy mood");
            return "HAPPY";
        }
    }
}
