package ${package}.resource.mapper;

import ${package}.repository.model.MessageEntity;
import ${package}.resource.dto.MessageDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {
    MessageDto map(MessageEntity message);

    List<MessageDto> map(List<MessageEntity> messages);
}
