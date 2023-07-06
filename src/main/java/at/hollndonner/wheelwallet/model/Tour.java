package at.hollndonner.wheelwallet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tourId;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

}

