package lk.ijse.relationships.entity;

/*
    @author DanujaV
    @created 7/9/23 - 9:37 AM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passenger")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_id")
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String country;
}
