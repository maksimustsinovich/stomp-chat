package by.ustsinovich.stompchat.controller.rest.impl;

import by.ustsinovich.stompchat.controller.rest.RoomController;
import by.ustsinovich.stompchat.dto.RoomDto;
import by.ustsinovich.stompchat.dto.filter.impl.RoomFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.RoomSortCriteria;
import by.ustsinovich.stompchat.mapper.RoomMapper;
import by.ustsinovich.stompchat.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RoomControllerImpl implements RoomController {

    private final RoomService roomService;

    private final RoomMapper roomMapper;

    @Override
    public RoomDto createRoom(RoomDto createRoomDto) {
        return roomMapper.toDto(roomService.createRoom(createRoomDto));
    }

    @Override
    public Page<RoomDto> getAllRooms(PaginationCriteria paginationCriteria, List<RoomSortCriteria> sortCriteria, RoomFilterCriteria filterCriteria) {
        return roomService.getAllRooms(paginationCriteria, sortCriteria, filterCriteria).map(roomMapper::toDto);
    }

    @Override
    public RoomDto getRoomById(Long id) {
        return roomMapper.toDto(roomService.getRoomById(id));
    }

    @Override
    public RoomDto updateRoomById(Long id, RoomDto updateRoomDto) {
        return roomMapper.toDto(roomService.updateRoomById(id));
    }

    @Override
    public void deleteRoomById(Long id) {
        roomService.deleteById(id);
    }

}
