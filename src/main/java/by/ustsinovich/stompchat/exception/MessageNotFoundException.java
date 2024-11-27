package by.ustsinovich.stompchat.exception;

public class MessageNotFoundException extends ResourceNotFoundException {

    public MessageNotFoundException(String message) {
        super(message);
    }

    public MessageNotFoundException(Long id) {
        super("Message with ID %d not found.".formatted(id));
    }

}
