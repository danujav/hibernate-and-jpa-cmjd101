package lk.ijse.relationships;

/*
    @author DanujaV
    @created 7/9/23 - 9:11 AM   
*/

import lk.ijse.relationships.entity.Owner;
import lk.ijse.relationships.entity.Passenger;
import lk.ijse.relationships.entity.Passport;
import lk.ijse.relationships.entity.Pet;
import lk.ijse.relationships.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class OneToManyDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

           /* Owner oshada = new Owner(2l, "Sandun");

            Pet tommy = new Pet(1l, "Tommy", oshada);
            Pet sisi = new Pet(2l, "Sisi", oshada);

            oshada.getPetList().add(tommy);
            oshada.getPetList().add(sisi);

            session.persist(oshada);
            session.persist(tommy);
            session.persist(sisi);*/

            Owner sandun = new Owner(2l, "Sandun");

            Pet rabbit = new Pet(3l, "Rabbit", sandun);

            sandun.getPetList().add(rabbit);

            session.persist(sandun);
            session.persist(rabbit);

            transaction.commit();

        }
    }
}
