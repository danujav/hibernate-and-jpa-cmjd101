package lk.ijse.relationships.entity;

/*
    @author DanujaV
    @created 7/9/23 - 10:59 AM   
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
@Table(name = "module")
public class Module {
    @Id
    @Column(name = "module_code")
    private String code;
    @Column(nullable = false)
    private String description;

    @ManyToMany
    @JoinTable (
            name = "lecturer_details",
            joinColumns = @JoinColumn(name = "module_code", nullable = false, referencedColumnName = "module_code"),
            inverseJoinColumns = @JoinColumn(name = "lecturer_id", nullable = false, referencedColumnName = "lecturer_id")
    )
    private List<Lecturer> lecturerList = new ArrayList<>();

    public Module(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
