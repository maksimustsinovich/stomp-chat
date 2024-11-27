package by.ustsinovich.stompchat.mapper;

import by.ustsinovich.stompchat.dto.MessageDto;
import by.ustsinovich.stompchat.entity.Message;
import org.mapstruct.Mapper;

@Mapper
public interface MessageMapper {

    MessageDto toDto(Message entity);

}
