package pmf.dmi.ris.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason="nema podataka")
public class MyNullPointerException extends Exception {

}
