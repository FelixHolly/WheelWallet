package at.hollndonner.wheelwallet.repository;
import at.hollndonner.wheelwallet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Add custom query methods if needed
}
