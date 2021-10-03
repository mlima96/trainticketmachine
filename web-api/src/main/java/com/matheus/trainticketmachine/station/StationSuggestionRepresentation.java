package com.matheus.trainticketmachine.station;

import com.matheus.trainticketmachine.domain.station.Station;
import com.matheus.trainticketmachine.domain.station.StationSuggestion;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
public class StationSuggestionRepresentation {
    private List<Station> stations;
    private Set<Character> validCharacters;

    public StationSuggestionRepresentation(StationSuggestion stationSuggestion) {
        this.stations = stationSuggestion.getStations();
        this.validCharacters = stationSuggestion.getValidCharacters();
    }
}
