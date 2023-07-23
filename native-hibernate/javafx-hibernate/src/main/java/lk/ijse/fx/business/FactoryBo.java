package lk.ijse.fx.business;

/*
    @author DanujaV
    @created 7/23/23 - 9:31 AM   
*/

import lk.ijse.fx.business.custom.impl.CustomerBoImpl;

public class FactoryBo {
    public static <T>T getBo(BoType type) {
        switch (type) {
            case CUSTOMER:
                return (T) new CustomerBoImpl();
            default:
                return null;
        }
    }
}
