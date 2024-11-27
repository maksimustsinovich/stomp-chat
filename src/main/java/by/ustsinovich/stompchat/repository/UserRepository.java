package by.ustsinovich.stompchat.repository;

import by.ustsinovich.stompchat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository for {@link User}.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
