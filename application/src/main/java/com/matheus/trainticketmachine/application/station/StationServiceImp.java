package com.matheus.trainticketmachine.application.station;

import com.matheus.trainticketmachine.domain.station.Station;
import com.matheus.trainticketmachine.domain.station.StationRepository;
import com.matheus.trainticketmachine.domain.station.StationService;
import com.matheus.trainticketmachine.domain.station.StationSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
public class StationServiceImp implements StationService {
    @Autowired
    private StationRepository repository;

    @Override
    public StationSuggestion search(String searchTerm) {
        List<Station> stations = repository.filterByName(searchTerm);
        Set<Character> suggestedCharacters = getSuggestedCharacters(searchTerm, stations);

        return new StationSuggestion(stations, suggestedCharacters);
    }

    private Set<Character> getSuggestedCharacters(String searchTerm, List<Station> stations) {
        Set<Character> suggestedCharacters = new LinkedHashSet<>();
        String stationName;

        for (Station station : stations) {
            stationName = station.getName();
            if (stationName.length() > searchTerm.length()) {
                suggestedCharacters.add(stationName.charAt(searchTerm.length()));
            }
        }
        return suggestedCharacters;
    }
}
