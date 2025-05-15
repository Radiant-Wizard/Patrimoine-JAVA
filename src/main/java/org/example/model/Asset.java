package org.example.model;

import java.util.List;

public record Asset(Person owner, List<Possession> possessions) {}
