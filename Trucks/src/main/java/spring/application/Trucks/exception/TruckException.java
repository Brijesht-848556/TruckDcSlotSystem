package spring.application.Trucks.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TruckException extends RuntimeException {
	 public TruckException(String message) {
	        super(message);
	    }
}
