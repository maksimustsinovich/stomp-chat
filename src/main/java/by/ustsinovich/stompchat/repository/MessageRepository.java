package by.ustsinovich.stompchat.repository;

import by.ustsinovich.stompchat.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link Message}.
 */
@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
}
