package com.bridgelabz;

public class MoodAnalyzer {
    // creating method named moodCheck having string return type and passing parameter of string type

    public String moodCheck(String message){
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
