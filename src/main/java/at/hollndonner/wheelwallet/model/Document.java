package at.hollndonner.wheelwallet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Documents")
public class Document implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;
    @ManyToOne
    @JoinColumn(name = "tour_id")
    private Tour tour;
    @ManyToOne
    @JoinColumn(name = "appointment_id")
    private Appointment appointment;
    @Column(name = "date")
    private LocalDateTime date;
    @Column(name = "type")
    private String type;
    @Column(name = "url")
    private String url;

    // Getters and Setters
}