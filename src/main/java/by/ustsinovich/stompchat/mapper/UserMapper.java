package by.ustsinovich.stompchat.mapper;

import by.ustsinovich.stompchat.dto.UserDto;
import by.ustsinovich.stompchat.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserMapper {

    UserDto toDto(User entity);

}
