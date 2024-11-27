package by.ustsinovich.stompchat.exception;

public class RoomNotFoundException extends ResourceNotFoundException {

    public RoomNotFoundException(String message) {
        super(message);
    }

    public RoomNotFoundException(Long id) {
        super("Room with ID %d not found.".formatted(id));
    }

}
