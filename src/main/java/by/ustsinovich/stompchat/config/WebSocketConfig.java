package by.ustsinovich.stompchat.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@EnableWebSocketMessageBroker
//@Configuration
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

}
