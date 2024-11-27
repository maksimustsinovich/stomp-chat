package by.ustsinovich.stompchat.repository;

import by.ustsinovich.stompchat.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link Room}.
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {
}
