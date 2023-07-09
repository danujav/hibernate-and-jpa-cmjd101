package lk.ijse.relationships.entity;

/*
    @author DanujaV
    @created 7/9/23 - 10:58 AM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lecturer")
public class Lecturer {
    @Id
    @Column(name = "lecturer_id")
    private Long id;
    @Column(nullable = false)
    private String name;

    @ManyToMany (mappedBy = "lecturerList")
    private List<Module> moduleList = new ArrayList<>();
}
