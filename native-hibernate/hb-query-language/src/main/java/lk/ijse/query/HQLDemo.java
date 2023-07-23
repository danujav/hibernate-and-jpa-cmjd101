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

public class HQLDemo {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession();) {
            Transaction transaction = session.beginTransaction();

            //select * from
            /*String hql = "from Customer";   //Customer -> Entity
            Query query = session.createQuery(hql);
            List<Customer> list = query.list();

            for(Customer customer : list) {
                System.out.println(customer);
            }*/

            //select a specified column
            /*String hql = "select name from Customer";   // name -> property | Customer -> entity
            Query query = session.createQuery(hql);
            List<String> list = query.list();

            for (String name : list) {
                System.out.println(name);
            }*/

            //where clause
            String hql = "from Customer where salary >= 20000";
            List<Customer> list = session.createQuery(hql).list();

            for (Customer customer : list) {
                System.out.println(customer);
            }

            transaction.commit();

        }
    }
}
