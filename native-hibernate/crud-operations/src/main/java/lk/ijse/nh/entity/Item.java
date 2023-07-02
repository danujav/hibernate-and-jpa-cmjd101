package lk.ijse.nh.entity;

/*
    @author DanujaV
    @created 7/2/23 - 1:51 PM   
*/

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Item {
    @Id
    private int code;
    private String description;
    private double unitPrice;
}
