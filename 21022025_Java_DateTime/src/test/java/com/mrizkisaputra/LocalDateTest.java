package com.mrizkisaputra;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAmount;

public class LocalDateTest {
    @Test
    public void test1() {
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2001, Month.MAY, 05);
        System.out.println(date1);
        System.out.println(date2);

        LocalDate newDate = date2.withYear(2021).withMonth(1);
        System.out.println(newDate);


    }

    @Test
    public void test2() {
        var day = 7;

        LocalDate date = LocalDate.now();
        var newDate = switch (day) {
            case 3 ->  {
                yield date.plusDays(3);
            }
            case 7 -> {
                yield date.plusDays(7);
            }
            default -> {
                yield date.plusDays(0);
            }
        };
        System.out.println(newDate);
    }
}
