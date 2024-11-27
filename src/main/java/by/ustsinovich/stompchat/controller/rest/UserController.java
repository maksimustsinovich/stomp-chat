package by.ustsinovich.stompchat.controller.rest;

import by.ustsinovich.stompchat.dto.UserDto;
import by.ustsinovich.stompchat.dto.filter.impl.UserFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.UserSortCriteria;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/users")
public interface UserController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    UserDto createUser(@Valid @RequestBody UserDto createUserDto);

    @GetMapping
    Page<UserDto> getAllUsers(@Valid @ParameterObject PaginationCriteria paginationCriteria, @RequestParam(required = false) List<UserSortCriteria> sortCriteria, @ParameterObject UserFilterCriteria filterCriteria);

    @GetMapping("/{id}")
    UserDto getUserById(@Min(1) @PathVariable Long id);

    @PutMapping("/{id}")
    UserDto updateUserById(@Min(1) @PathVariable Long id, @Valid @RequestBody UserDto updateUserDto);

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteUserById(@Min(1) @PathVariable Long id);

}
