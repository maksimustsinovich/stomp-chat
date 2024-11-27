package by.ustsinovich.stompchat.controller.rest;

import by.ustsinovich.stompchat.dto.MessageDto;
import by.ustsinovich.stompchat.dto.filter.impl.MessageFilterCriteria;
import by.ustsinovich.stompchat.dto.pagination.PaginationCriteria;
import by.ustsinovich.stompchat.dto.sort.impl.MessageSortCriteria;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/messages")
public interface MessageController {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    MessageDto createMessage(@Valid @RequestBody MessageDto createMessageDto);

    @GetMapping
    Page<MessageDto> getAllMessages(@Valid @ParameterObject PaginationCriteria paginationCriteria, @RequestParam(required = false) List<MessageSortCriteria> sortCriteria, @ParameterObject MessageFilterCriteria filterCriteria);

    @GetMapping("/{id}")
    MessageDto getMessageById(@Min(1) @PathVariable Long id);

    @PutMapping("/{id}")
    MessageDto updateMessageById(@Min(1) @PathVariable Long id, @Valid @RequestBody MessageDto updateMessageDto);

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    void deleteMessageById(@Min(1) @PathVariable Long id);

}
