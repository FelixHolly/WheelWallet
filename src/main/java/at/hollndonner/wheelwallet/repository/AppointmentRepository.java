package at.hollndonner.wheelwallet.repository;
import at.hollndonner.wheelwallet.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    // Add custom query methods if needed
}

