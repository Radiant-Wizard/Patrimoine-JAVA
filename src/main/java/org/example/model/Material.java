package org.example.model;

public record Material(String name, Double value, Integer depreciationRate) implements Possession {
    @Override
    public Double getCurrentValue() {
        return (value * depreciationRate) / 100;
    }
}
