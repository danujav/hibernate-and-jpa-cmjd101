package lk.ijse.fx.dao.custom.impl;

/*
    @author DanujaV
    @created 7/23/23 - 9:40 AM   
*/

import lk.ijse.fx.dao.custom.CustomerDao;
import lk.ijse.fx.entity.Customer;
import lk.ijse.fx.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class CustomerDaoImpl implements CustomerDao {
    @Override
    public boolean save(Customer customer) throws Exception {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction transaction = session.beginTransaction();

        session.persist(customer);

        transaction.commit();

        return true;
    }
}
