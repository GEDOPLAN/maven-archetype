package org.acme.resource.mapper;

import org.acme.repository.model.MessageEntity;
import org.acme.resource.dto.MessageDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    MessageDto map(MessageEntity message);

    List<MessageDto> map(List<MessageEntity> messages);
}
