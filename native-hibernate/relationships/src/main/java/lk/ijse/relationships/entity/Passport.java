package lk.ijse.relationships.entity;

/*
    @author DanujaV
    @created 7/9/23 - 9:40 AM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "passport")
public class Passport {
    @Id
    @Column(name = "passport_number")
    private String pNumber;
    @Column(name = "issue_date", nullable = false)
    private String issueDate;     //yyyy-MM-dd

    @OneToOne
    @JoinColumn(name = "passenger_id", nullable = false, referencedColumnName = "passenger_id")
    private Passenger passenger;
}
