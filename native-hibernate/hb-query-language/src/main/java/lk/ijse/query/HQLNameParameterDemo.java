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

public class HQLNameParameterDemo {
    public static void main(String[] args) {

        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession();) {
            Transaction transaction = session.beginTransaction();

            System.out.print("Input customer name for search: ");
            String name = new Scanner(System.in).next();

            String hql = "from Customer where name = :customerName";

            Query query = session.createQuery(hql);
            query.setParameter("customerName", name);

            List<Customer> list = query.list();

            for (Customer customer : list) {
                System.out.println(customer);
            }


            transaction.commit();

        }
    }
}
