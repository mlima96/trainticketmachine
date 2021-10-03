package com.matheus.trainticketmachine.domain.station;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
public class StationSuggestion {
    private List<Station> stations;
    private Set<Character> validCharacters;
}
