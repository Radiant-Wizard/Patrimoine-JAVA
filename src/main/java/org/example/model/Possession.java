package org.example.model;

public sealed interface Possession permits Money, Material{
    Double getCurrentValue();
}
