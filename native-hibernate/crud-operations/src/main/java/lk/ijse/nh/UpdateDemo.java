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

public class UpdateDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
             Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Item i1 = session.find(Item.class, 5);

            session.detach(i1); //persistence -> detached
            session.clear();    //persistence -> detached

            i1.setDescription("Pepsi");
            session.merge(i1);  //detached -> persistence

            transaction.commit();
        }
    }
}
