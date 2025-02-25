package com.mrizkisaputra;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {
    @Value()
    private String id;

    private String name;
}
