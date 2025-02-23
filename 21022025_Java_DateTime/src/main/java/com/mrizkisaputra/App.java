package com.mrizkisaputra;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        System.out.println(TimeZone.getTimeZone(ZoneId.systemDefault()));

    }
}
