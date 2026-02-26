package ${package}.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import ${package}.repository.model.MessageEntity;
import ${package}.service.MessageService;

import java.util.List;

@Path("/hello")
public class GreetingResource {

    @Inject
    MessageService messageService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageEntity> hello() {
        return messageService.getAllMessages();
    }

    @GET
    @Path("{message}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<MessageEntity> hello(String message) {
        return messageService.getMessagesByContent(message);
    }
}
