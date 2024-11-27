package by.ustsinovich.stompchat.service;

import by.ustsinovich.stompchat.dto.UserDto;
import by.ustsinovich.stompchat.dto.filter.impl.UserFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.UserSortCriteria;
import by.ustsinovich.stompchat.entity.User;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.data.domain.Page;

import java.util.List;

public interface UserService {

    User createUser(@Valid UserDto createUserDto);

    Page<User> getAllUsers(@Valid PaginationCriteria paginationCriteria, List<UserSortCriteria> sortCriteria, UserFilterCriteria filterCriteria);

    User getUserById(@Min(1) Long id);

    User updateUserById(@Min(1) Long id, @Valid UserDto updateUserDto);

    void deleteUserById(@Min(1) Long id);

}
