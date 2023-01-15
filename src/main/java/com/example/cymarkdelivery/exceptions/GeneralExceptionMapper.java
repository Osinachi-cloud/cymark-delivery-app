package com.example.cymarkdelivery.exceptions;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class GeneralExceptionMapper implements ExceptionMapper<Throwable> {
    @Override
    public Response toResponse(Throwable throwable) {
        ErrorMessage errorMessage = new ErrorMessage(throwable.getMessage() + " " + throwable.getCause(), 500, "https://google.com");
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR.ordinal())
                .entity(errorMessage)
                .build();
    }
}
