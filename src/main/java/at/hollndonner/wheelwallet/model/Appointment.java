package at.hollndonner.wheelwallet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Appointments")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "type")
    private String type;
    @Column(name = "notes")
    private String notes;


    // Constructors, getters, and setters
}

