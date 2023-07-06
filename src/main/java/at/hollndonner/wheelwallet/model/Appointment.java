package at.hollndonner.wheelwallet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @Column(name = "total_distance")
    private Long totalDistance;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "start_location")
    private String startLocation;
    @Column(name = "end_location")
    private String endLocation;
    @Column(name = "notes")
    private String notes;

    // Constructors, getters, and setters
}

