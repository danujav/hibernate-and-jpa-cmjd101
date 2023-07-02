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

public class GetDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = session.get(Item.class, 1);
            System.out.println("i1: " + i1);

            Item i2 = session.find(Item.class, 2);
            System.out.println("i2: " + i2);

            transaction.commit();
        }
    }
}
