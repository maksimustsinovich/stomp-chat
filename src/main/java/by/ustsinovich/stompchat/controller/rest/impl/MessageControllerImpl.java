package by.ustsinovich.stompchat.controller.rest.impl;

import by.ustsinovich.stompchat.controller.rest.MessageController;
import by.ustsinovich.stompchat.dto.MessageDto;
import by.ustsinovich.stompchat.dto.filter.impl.MessageFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.MessageSortCriteria;
import by.ustsinovich.stompchat.mapper.MessageMapper;
import by.ustsinovich.stompchat.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class MessageControllerImpl implements MessageController {

    private final MessageService messageService;

    private final MessageMapper messageMapper;

    @Override
    public MessageDto createMessage(MessageDto createMessageDto) {
        return messageMapper.toDto(messageService.createMessage(createMessageDto));
    }

    @Override
    public Page<MessageDto> getAllMessages(PaginationCriteria paginationCriteria, List<MessageSortCriteria> sortCriteria, MessageFilterCriteria filterCriteria) {
        return messageService.getAllMessages(paginationCriteria, sortCriteria, filterCriteria).map(messageMapper::toDto);
    }

    @Override
    public MessageDto getMessageById(Long id) {
        return messageMapper.toDto(messageService.getMessageById(id));
    }

    @Override
    public MessageDto updateMessageById(Long id, MessageDto updateMessageDto) {
        return messageMapper.toDto(messageService.updateById(id, updateMessageDto));
    }

    @Override
    public void deleteMessageById(Long id) {
        messageService.deleteById(id);
    }

}
