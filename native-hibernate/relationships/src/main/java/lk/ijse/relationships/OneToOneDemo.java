package lk.ijse.relationships;

/*
    @author DanujaV
    @created 7/9/23 - 9:11 AM   
*/

import lk.ijse.relationships.entity.Employee;
import lk.ijse.relationships.entity.emeddeble.Name;
import lk.ijse.relationships.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToOneDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();


            transaction.commit();

        }
    }
}
