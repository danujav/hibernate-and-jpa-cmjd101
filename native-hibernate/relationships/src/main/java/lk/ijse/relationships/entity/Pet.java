package lk.ijse.relationships.entity;

/*
    @author DanujaV
    @created 7/9/23 - 10:07 AM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "pet")
public class Pet {
    @Id
    @Column(name = "pet_id")
    private Long id;
    @Column(nullable = false, name = "pet_name")
    private String name;

    @ManyToOne
    private Owner owner;
}
