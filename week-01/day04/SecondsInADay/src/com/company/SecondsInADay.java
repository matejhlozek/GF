package com.company;

public class SecondsInADay {

    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int hoursInADay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;

        int remainingHours = hoursInADay - currentHours; //10
        int remainingMinutes = minutesInHour - currentMinutes; //26
        int remainingSeconds = secondsInMinute - currentSeconds; //18

        System.out.println("Remaining seconds of this day: " + ((remainingHours * minutesInHour * secondsInMinute) + (remainingMinutes * secondsInMinute) + remainingSeconds));

    }
}
