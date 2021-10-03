package com.matheus.trainticketmachine.infrastructure.station;

import com.matheus.trainticketmachine.domain.station.Station;
import com.matheus.trainticketmachine.domain.station.StationRepository;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class StationRepositoryImp implements StationRepository {
    private static final List<Station> stations = Arrays.asList(
            new Station("Barcelos"),
            new Station("Barqueiros"),
            new Station("Barquinha"),
            new Station("Barragem de Belver"),
            new Station("Barreiro"),
            new Station("Barreiro-A"),
            new Station("Abrantes"),
            new Station("Adémia"),
            new Station("Afife"),
            new Station("Agualva-Cacém"),
            new Station("Aguda"),
            new Station("Aguim"),
            new Station("Albergaria dos Doze"),
            new Station("Albufeira-Ferreiras"),
            new Station("Alcaide"),
            new Station("Alcains"),
            new Station("Santa Iria"),
            new Station("Santa Augusta"),
            new Station("Santa Margarida"),
            new Station("Santana-Cartaxo"),
            new Station("Santarém"),
            new Station("Santo Amaro de Oeiras"),
            new Station("Castanheira do Ribatejo"),
            new Station("Castelejo"),
            new Station("Castelo Branco"),
            new Station("Castelo Novo"),
            new Station("Caxias"),
            new Station("Caxarias"),
            new Station("Caíde"),
            new Station("Celorico da Beira"),
            new Station("Cerdeira"),
            new Station("Chança"),
            new Station("Coimbra")
    );

    @Override
    public List<Station> filterByName(String searchTerm) {
        String upperSearchTerm = searchTerm.toUpperCase();
        return stations
                .stream()
                .filter(station -> station.getName().toUpperCase().startsWith(upperSearchTerm))
                .sorted()
                .collect(Collectors.toList());
    }
}
