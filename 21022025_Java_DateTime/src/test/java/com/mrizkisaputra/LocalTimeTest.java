package com.mrizkisaputra;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeTest {
    @Test
    public void test() {
        LocalTime currentTime = LocalTime.now();
        LocalTime time = LocalTime.of(18, 0, 0);

        System.out.println("Current Time: "+currentTime);
        System.out.println(time);
        System.out.println(currentTime.plusHours(2));
    }


}
