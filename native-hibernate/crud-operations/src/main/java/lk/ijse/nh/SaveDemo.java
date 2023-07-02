package lk.ijse.nh;

/*
    @author DanujaV
    @created 7/2/23 - 1:53 PM   
*/

import lk.ijse.nh.entity.Item;
import lk.ijse.nh.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class SaveDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = new Item(6, "Pepsi", 150);

//            session.save(i1);   //5.x ~ Deprecated
            session.persist(i1);    //6.x

            transaction.commit();

        }
    }
}
