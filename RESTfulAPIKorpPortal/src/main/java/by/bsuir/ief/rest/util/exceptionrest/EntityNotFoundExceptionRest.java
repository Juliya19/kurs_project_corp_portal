package by.bsuir.ief.rest.util.exceptionrest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by andrey on 21.03.2016.
 */
@ResponseStatus(value= HttpStatus.NO_CONTENT, reason="No such Entity")  // 404
public class EntityNotFoundExceptionRest extends RuntimeException {
    public EntityNotFoundExceptionRest(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

