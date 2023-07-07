package at.hollndonner.wheelwallet.repository;
import at.hollndonner.wheelwallet.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
    // Add custom query methods if needed
}

