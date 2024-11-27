package by.ustsinovich.stompchat.service;

import by.ustsinovich.stompchat.dto.MessageDto;
import by.ustsinovich.stompchat.dto.filter.impl.MessageFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.MessageSortCriteria;
import by.ustsinovich.stompchat.entity.Message;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springframework.data.domain.Page;

import java.util.List;

public interface MessageService {

    Message createMessage(@Valid MessageDto createMessageDto);

    Page<Message> getAllMessages(@Valid PaginationCriteria paginationCriteria, List<MessageSortCriteria> sortCriteria, MessageFilterCriteria filterCriteria);

    Message getMessageById(@Min(1) Long id);

    Message updateById(@Min(1) Long id, @Valid MessageDto updateMessageDto);

    void deleteById(@Min(1) Long id);

}
