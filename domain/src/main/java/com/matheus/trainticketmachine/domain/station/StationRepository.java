package com.matheus.trainticketmachine.domain.station;

import java.util.List;

public interface StationRepository {
    List<Station> filterByName(String searchTerm);
}
