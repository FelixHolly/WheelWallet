package at.hollndonner.wheelwallet.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "Cars")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column(name = "model")
    private String model;
    @Column(name = "make")
    private String make;
    @Column(name = "year")
    private int year;
    @Column(name = "color")
    private String color;
    @Column(name = "fin")
    private String fin;
    @Column(name = "hp")
    private int hp;
    @Column(name = "notes")
    private String notes;
    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Document> documents;

    // Getters and Setters
}