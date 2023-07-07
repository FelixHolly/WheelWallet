package at.hollndonner.wheelwallet.repository;

import at.hollndonner.wheelwallet.model.Document;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Integer> {
    // Add custom query methods if needed
}
