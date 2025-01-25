package business.flight;

import common.dto.result.Result;
import common.dto.services.FlightDTO;
import common.exception.SAException;
import jakarta.ejb.Remote;

@Remote
public interface SAAFlight {
    Result<FlightDTO> search(long idFlight) throws SAException;
}