package lk.ijse.nh.entity;

/*
    @author DanujaV
    @created 7/2/23 - 1:51 PM   
*/

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int code;
    private String description;
    @Column(name = "price", columnDefinition = "DOUBLE", nullable = false)
    private double unitPrice;

    public Item(String description, double unitPrice) {
        this.description = description;
        this.unitPrice = unitPrice;
    }
}
