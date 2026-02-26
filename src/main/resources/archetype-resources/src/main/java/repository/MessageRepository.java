package ${package}.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import ${package}.repository.model.MessageEntity;

import java.util.List;

@ApplicationScoped
public class MessageRepository implements PanacheRepository<MessageEntity> {

    public List<MessageEntity> findByMessageContent(String messageContent) {
        return list("message like ?1", "%" + messageContent + "%");
    }
}
