package com.matheus.trainticketmachine.station;

import com.matheus.trainticketmachine.domain.station.StationService;
import com.matheus.trainticketmachine.domain.station.StationSuggestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/stations")
public class StationController {
    @Autowired
    private StationService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<StationSuggestionRepresentation> search(@RequestParam("searchTerm") String searchTerm) {
        StationSuggestion stationSuggestion = service.search(searchTerm);
        StationSuggestionRepresentation representation = new StationSuggestionRepresentation(stationSuggestion);
        return ResponseEntity.ok(representation);
    }
}
