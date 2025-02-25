package com.mrizkisaputra;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
    @NotBlank(message = "name cannot be blank")
    private String name;

    @NotNull(message = "age cannot be null")
    @Min(value = 10)
    private int age;

    @NotNull
    @Valid
    private Address address;
}
