package com.rabbitmq.mogul;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class SimpleMessage implements Serializable {
    private String name;
    private String description;

    public SimpleMessage() {
    }

    public String toString() {
        return "SimpleMessage{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

}
