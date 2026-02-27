package de.gedoplan.resource.mapper;

import de.gedoplan.repository.model.MessageEntity;
import de.gedoplan.resource.dto.MessageDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    MessageDto map(MessageEntity message);

    List<MessageDto> map(List<MessageEntity> messages);
}
