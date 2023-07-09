package lk.ijse.relationships.entity;

/*
    @author DanujaV
    @created 7/9/23 - 10:06 AM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "owner")
public class Owner {
    @Id
    private Long id;
    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "owner")
    private List<Pet> petList = new ArrayList<>();
}
