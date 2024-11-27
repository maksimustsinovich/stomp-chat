package by.ustsinovich.stompchat.service.impl;

import by.ustsinovich.stompchat.dto.UserDto;
import by.ustsinovich.stompchat.dto.filter.impl.UserFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.UserSortCriteria;
import by.ustsinovich.stompchat.entity.User;
import by.ustsinovich.stompchat.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public User createUser(UserDto createUserDto) {
        return new User();
    }

    @Override
    public Page<User> getAllUsers(PaginationCriteria paginationCriteria, List<UserSortCriteria> sortCriteria, UserFilterCriteria filterCriteria) {
        return Page.empty();
    }

    @Override
    public User getUserById(Long id) {
        return new User();
    }

    @Override
    public User updateUserById(Long id, UserDto updateUserDto) {
        return new User();
    }

    @Override
    public void deleteUserById(Long id) {

    }

}
