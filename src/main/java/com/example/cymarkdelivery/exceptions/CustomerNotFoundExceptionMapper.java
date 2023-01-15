package com.example.cymarkdelivery.exceptions;


import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class CustomerNotFoundExceptionMapper implements ExceptionMapper<CustomerNotFoundException> {


    @Override
    public Response toResponse(CustomerNotFoundException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getMessage() + "  " + e.getCause(), 404, "https://google.com");
        return Response.status(Response.Status.NOT_FOUND)
                .entity(errorMessage)
                .build();
    }
}
