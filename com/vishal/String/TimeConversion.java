package com.vishal.String;

public class TimeConversion {

    static public String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        String period = s.substring(8);
        String time = s.substring(2, 8);

        if (period.equals("AM") && hour == 12) {
            return "00" + time;
        } else if (period.equals("PM") && hour != 12) {
            return (hour + 12) + time;
        } else {
            return hour + time;
        }
    }


    public static void main(String[] args) {
        // Example usage:
        System.out.println(timeConversion("07:45:54PM"));  // Output: "19:45:54"
        System.out.println(timeConversion("12:01:00AM"));  // Output: "00:01:00"
        System.out.println(timeConversion("12:00:00AM"));  // Output: "00:00:00"
    }
}
