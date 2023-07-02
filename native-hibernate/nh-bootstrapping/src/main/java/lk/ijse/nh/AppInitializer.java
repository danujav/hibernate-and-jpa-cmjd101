package lk.ijse.nh;

/*
    @author DanujaV
    @created 7/2/23 - 10:37 AM   
*/

import lk.ijse.nh.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppInitializer {
    public static void main(String[] args) {
        //try with resource
        try(SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            Session session = sessionFactory.openSession()) {

            System.out.println("session: " + session);
        }

//        session.close();
//        sessionFactory.close();
    }
}
