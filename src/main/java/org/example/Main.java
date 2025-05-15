package org.example;

import org.example.model.*;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person taratra = new Person("Taratra");
        List<Possession> possessions = List.of(
                new Material("Laptop", 3500000.00, 10),
                new Money(25000.00, Currency.ARIARY)
        );
        Asset asset = new Asset(taratra, possessions);
    }
}
