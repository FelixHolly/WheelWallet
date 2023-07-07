package at.hollndonner.wheelwallet.repository;

import at.hollndonner.wheelwallet.model.Tour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TourRepository extends JpaRepository<Tour, Long> {
    // Add custom query methods if needed
}

