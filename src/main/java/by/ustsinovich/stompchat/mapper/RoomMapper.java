package by.ustsinovich.stompchat.mapper;

import by.ustsinovich.stompchat.dto.RoomDto;
import by.ustsinovich.stompchat.entity.Room;
import org.mapstruct.Mapper;

@Mapper
public interface RoomMapper {

    RoomDto toDto(Room entity);

}
