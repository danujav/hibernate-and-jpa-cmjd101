package lk.ijse.relationships.entity;

/*
    @author DanujaV
    @created 7/9/23 - 9:05 AM   
*/

import jakarta.persistence.*;
import lk.ijse.relationships.entity.emeddeble.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "employee")
public class Employee {
    @Id
    private Long id;
    @Embedded
    private Name name;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String address;
}
