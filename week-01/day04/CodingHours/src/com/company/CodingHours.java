package com.company;

public class CodingHours {

    public static void main(String[] args) {

	int weeksOfSemester = 17;
    int dailyCodingHours = 6;
    int averageWorkHoursInWeek = 52;
    int workDaysOfWeek = 5;

        System.out.println("Attendee codes for " + (weeksOfSemester*workDaysOfWeek*dailyCodingHours) + " hours in a semester.");

        System.out.println("Percentage of coding hours according to work hours is " + ((float)dailyCodingHours*workDaysOfWeek/averageWorkHoursInWeek*100) + " %");

    }
}
