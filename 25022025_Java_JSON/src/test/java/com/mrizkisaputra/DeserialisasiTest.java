package com.mrizkisaputra;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class DeserialisasiTest {
    @Test
    public void jsonToObject() {
        String dataJson = """
                {
                "status": "OK",
                "data": [
                    {"id":1,"name":"kiki","email":"mrizkisaputra6@gmail.com","address":{"street":"jln pertahanan","city":"palembang"}},
                    {"id":2,"name":"rizki","email":"mrizkisaputra6@gmail.com","address":{"street":"jln sentosa","city":"palembang"}}
                ]
                }
                """;

        record Response(String status, List<User> data){}

        ObjectMapper mapper = new ObjectMapper();

        try {
            Response response = mapper.readValue(dataJson, Response.class);
            System.out.println(response);
        } catch (JsonProcessingException e) {
            Assertions.fail(e);
        }

    }
}
