package org.example.model;

public record Money(Double value, Currency currency) implements Possession{
    @Override
    public Double getCurrentValue() {
        return value;
    }
}
