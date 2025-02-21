package com.mrizkisaputra;

import com.google.gson.Gson;
import com.mrizkisaputra.model.Expense;

import java.time.LocalDateTime;

/**
 * Hello world!
 */
public class App {
    private static Gson gson = new Gson();
    public static void main(String[] args) {
        Expense expense = new Expense("Dinner", 100);

        String expenseJson = gson.toJson(expense);
        System.out.println(expenseJson);
    }
}
