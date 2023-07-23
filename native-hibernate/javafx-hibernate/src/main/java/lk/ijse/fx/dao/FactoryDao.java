package lk.ijse.fx.dao;

/*
    @author DanujaV
    @created 7/23/23 - 9:37 AM   
*/

import lk.ijse.fx.dao.custom.impl.CustomerDaoImpl;

public class FactoryDao {
    public static <T> T getDao(DaoType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerDaoImpl();
            default:
                return null;
        }
    }
}
