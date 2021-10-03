package com.matheus.trainticketmachine.domain.station;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Station implements Comparable<Station> {
    private String name;

    @Override
    public int compareTo(Station o) {
        return name.compareTo(o.name);
    }
}
