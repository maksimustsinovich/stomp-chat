package by.ustsinovich.stompchat.service.impl;

import by.ustsinovich.stompchat.dto.RoomDto;
import by.ustsinovich.stompchat.dto.filter.impl.RoomFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.RoomSortCriteria;
import by.ustsinovich.stompchat.entity.Room;
import by.ustsinovich.stompchat.service.RoomService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    @Override
    public Room createRoom(RoomDto createRoomDto) {
        return new Room();
    }

    @Override
    public Page<Room> getAllRooms(PaginationCriteria paginationCriteria, List<RoomSortCriteria> sortCriteria, RoomFilterCriteria filterCriteria) {
        return Page.empty();
    }

    @Override
    public Room getRoomById(Long id) {
        return new Room();
    }

    @Override
    public Room updateRoomById(Long id) {
        return new Room();
    }

    @Override
    public void deleteById(Long id) {

    }

}
