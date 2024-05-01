package ch_1_3;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println("Age is " + getAge(2000));
        System.out.println("Age is " + getAge(2025));
    }

    public static int getAge(int year) {
        int curYear = LocalDateTime.now().getYear();
        if (year > curYear) {
            throw new IllegalArgumentException("Input Error");
        }
        return curYear - year;
    }
}
