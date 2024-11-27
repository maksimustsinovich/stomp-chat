package by.ustsinovich.stompchat.controller.rest;

import by.ustsinovich.stompchat.dto.RoomDto;
import by.ustsinovich.stompchat.dto.filter.impl.RoomFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.RoomSortCriteria;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/rooms")
public interface RoomController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    RoomDto createRoom(@Valid @RequestBody RoomDto createRoomDto);

    @GetMapping
    Page<RoomDto> getAllRooms(@Valid @ParameterObject PaginationCriteria paginationCriteria, @RequestParam(required = false)  List<RoomSortCriteria> sortCriteria, @ParameterObject RoomFilterCriteria filterCriteria);

    @GetMapping("/{id}")
    RoomDto getRoomById(@Min(1) @PathVariable Long id);

    @PutMapping("/{id}")
    RoomDto updateRoomById(@Min(1) @PathVariable Long id, @Valid @RequestBody RoomDto updateRoomDto);

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteRoomById(@Min(1) @PathVariable Long id);

}
