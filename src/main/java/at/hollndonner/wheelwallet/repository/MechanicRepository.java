package at.hollndonner.wheelwallet.repository;
import at.hollndonner.wheelwallet.model.Mechanic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MechanicRepository extends JpaRepository<Mechanic, Long> {
    // Add custom query methods if needed
}

