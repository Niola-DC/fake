package org.start.consumption.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {
    String name;
    String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
