package by.ustsinovich.stompchat.service.impl;

import by.ustsinovich.stompchat.dto.MessageDto;
import by.ustsinovich.stompchat.dto.filter.impl.MessageFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.MessageSortCriteria;
import by.ustsinovich.stompchat.entity.Message;
import by.ustsinovich.stompchat.service.MessageService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Override
    public Message createMessage(MessageDto createMessageDto) {
        return new Message();
    }

    @Override
    public Page<Message> getAllMessages(PaginationCriteria paginationCriteria, List<MessageSortCriteria> sortCriteria, MessageFilterCriteria filterCriteria) {
        return Page.empty();
    }

    @Override
    public Message getMessageById(Long id) {
        return new Message();
    }

    @Override
    public Message updateById(Long id, MessageDto updateMessageDto) {
        return new Message();
    }

    @Override
    public void deleteById(Long id) {

    }

}
