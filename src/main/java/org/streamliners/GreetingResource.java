package org.streamliners;

import org.testcontainers.shaded.org.checkerframework.checker.units.qual.C;

import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @Inject
    GenAIService genAIService;
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String chat(String message) {
        return genAIService.chat(message);
    }
}
