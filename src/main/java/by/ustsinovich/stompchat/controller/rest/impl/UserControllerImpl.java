package by.ustsinovich.stompchat.controller.rest.impl;

import by.ustsinovich.stompchat.controller.rest.UserController;
import by.ustsinovich.stompchat.dto.UserDto;
import by.ustsinovich.stompchat.dto.filter.impl.UserFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.UserSortCriteria;
import by.ustsinovich.stompchat.mapper.UserMapper;
import by.ustsinovich.stompchat.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserControllerImpl implements UserController {

    private final UserService userService;

    private final UserMapper userMapper;

    @Override
    public UserDto createUser(UserDto createUserDto) {
        return userMapper.toDto(userService.createUser(createUserDto));
    }

    @Override
    public Page<UserDto> getAllUsers(PaginationCriteria paginationCriteria, List<UserSortCriteria> sortCriteria, UserFilterCriteria filterCriteria) {
        return userService.getAllUsers(paginationCriteria, sortCriteria, filterCriteria).map(userMapper::toDto);
    }

    @Override
    public UserDto getUserById(Long id) {
        return userMapper.toDto(userService.getUserById(id));
    }

    @Override
    public UserDto updateUserById(Long id, UserDto updateUserDto) {
        return userMapper.toDto(userService.updateUserById(id, updateUserDto));
    }

    @Override
    public void deleteUserById(Long id) {
        userService.deleteUserById(id);
    }

}
