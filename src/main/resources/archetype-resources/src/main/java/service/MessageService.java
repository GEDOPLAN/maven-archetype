package ${package}.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import ${package}.repository.MessageRepository;
import ${package}.repository.model.MessageEntity;

import java.util.List;

@ApplicationScoped
public class MessageService {

    @Inject
    MessageRepository messageRepository;

    public List<MessageEntity> getAllMessages() {
        return messageRepository.listAll();
    }

    public List<MessageEntity> getMessagesByContent(String messageContent) {
        return messageRepository.findByMessageContent(messageContent);
    }
}
