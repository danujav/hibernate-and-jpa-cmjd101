package lk.ijse.fx.business.custom;

/*
    @author DanujaV
    @created 7/23/23 - 9:29 AM   
*/

import lk.ijse.fx.business.SuperBo;
import lk.ijse.fx.dto.CustomerDto;

public interface CustomerBo extends SuperBo {
    boolean saveCustomer(CustomerDto dto) throws Exception;
}
