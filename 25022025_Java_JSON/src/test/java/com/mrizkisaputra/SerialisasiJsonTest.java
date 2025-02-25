package com.mrizkisaputra;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SerialisasiJsonTest {
    @Test
    public void mapToJson() {
        ObjectMapper mapper = new ObjectMapper();

        Map<String, Set<User>> user = Map.of(
                "data", Set.of(
                        new User(1, "user1", "user1@gmail.com", null),
                        new User(2, "user2", "user2@gmail.com", null),
                        new User(3, "user3", "user3@gmail.com", null)
                )
        );

        try {
            String jsonString = mapper.writeValueAsString(user);
            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            Assertions.fail(e);
        }
    }

    @Test
    public void listToJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        List<String> hobbies = List.of("sport", "coding", "musik");

        String json = mapper.writeValueAsString(hobbies);
        System.out.println(json);
    }

    @Test
    public void objectToJson() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper()
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                .setDateFormat(new SimpleDateFormat("yyyy-MM-dd"))
                .registerModule(new JavaTimeModule());

        record Expense(String description, int amount, LocalDate createdAt){}
        Expense expense = new Expense("Dinner", 100, LocalDate.now());

        String json = mapper.writeValueAsString(expense);
        System.out.println(json);
    }
}
