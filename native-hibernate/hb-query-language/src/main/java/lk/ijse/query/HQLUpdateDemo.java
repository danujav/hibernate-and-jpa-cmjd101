package lk.ijse.query;

/*
    @author DanujaV
    @created 7/2/23 - 1:40 PM   
*/

import lk.ijse.query.entity.Customer;
import lk.ijse.query.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
import java.util.Scanner;

public class HQLUpdateDemo {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession();) {
            Transaction transaction = session.beginTransaction();

            double incrementValue = 10000;
            String hql = "update Customer set salary = (salary + :data) where address = 'Panadura'";

            Query query = session.createQuery(hql);
            query.setParameter("data", incrementValue);

            int affectedRow = query.executeUpdate();
            if(affectedRow > 0) System.out.println("salary updated");
            else System.out.println("not updated");

            transaction.commit();

        }
    }
}
