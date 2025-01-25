package common.dto.services;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FlightDTO {
    private long id;
    private String codeFlight;
    private String weekDay;
    private String arrivalTime;
    private String departureTime;
    private long idAircraft;
    private long idOriginFlight;
    private long idDestinationFlight;
    private boolean active;
}
