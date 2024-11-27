package by.ustsinovich.stompchat.controller.websocket;

import by.ustsinovich.stompchat.dto.MessageDto;
import jakarta.validation.constraints.Min;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

public interface ChatController {

    @MessageMapping("/ws/room/{roomId}")
    @SendTo("/topic/chat")
    void sendMessage(@DestinationVariable @Min(1) Long roomId, MessageDto messageDto);

}
