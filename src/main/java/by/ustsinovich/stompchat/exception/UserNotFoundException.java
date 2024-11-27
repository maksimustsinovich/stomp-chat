package by.ustsinovich.stompchat.exception;

public class UserNotFoundException extends ResourceNotFoundException {

    public UserNotFoundException(String message) {
        super(message);
    }

    public UserNotFoundException(Long id) {
        super("User with ID %d not found.".formatted(id));
    }

}
