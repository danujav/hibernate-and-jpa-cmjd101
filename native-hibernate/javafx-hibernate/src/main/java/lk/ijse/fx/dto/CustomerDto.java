package lk.ijse.fx.dto;

/*
    @author DanujaV
    @created 7/23/23 - 9:27 AM   
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
    private String id;
    private String name;
    private String address;
    private double salary;
}
