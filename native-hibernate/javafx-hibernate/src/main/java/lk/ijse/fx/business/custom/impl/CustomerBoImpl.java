package lk.ijse.fx.business.custom.impl;

/*
    @author DanujaV
    @created 7/23/23 - 9:29 AM   
*/

import lk.ijse.fx.business.custom.CustomerBo;
import lk.ijse.fx.dao.DaoType;
import lk.ijse.fx.dao.FactoryDao;
import lk.ijse.fx.dao.custom.CustomerDao;
import lk.ijse.fx.dto.CustomerDto;
import lk.ijse.fx.entity.Customer;

public class CustomerBoImpl implements CustomerBo {

    private CustomerDao customerDao = FactoryDao.getDao(DaoType.CUSTOMER);
    @Override
    public boolean saveCustomer(CustomerDto dto) throws Exception {
        Customer customer = new Customer(
                dto.getId(),
                dto.getName(),
                dto.getAddress(),
                dto.getSalary()
        );
        return customerDao.save(customer);
    }
}
