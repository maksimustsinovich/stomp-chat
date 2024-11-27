package by.ustsinovich.stompchat.service;

import by.ustsinovich.stompchat.dto.RoomDto;
import by.ustsinovich.stompchat.dto.filter.impl.RoomFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.RoomSortCriteria;
import by.ustsinovich.stompchat.entity.Room;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.data.domain.Page;

import java.util.List;

public interface RoomService {

    Room createRoom(@Valid RoomDto createRoomDto);

    Page<Room> getAllRooms(@Valid PaginationCriteria paginationCriteria, List<RoomSortCriteria> sortCriteria, RoomFilterCriteria filterCriteria);

    Room getRoomById(@Min(1) Long id);

    Room updateRoomById(@Min(1) Long id);

    void deleteById(@Min(1) Long id);

}
