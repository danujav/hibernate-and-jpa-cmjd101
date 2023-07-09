package lk.ijse.relationships;

/*
    @author DanujaV
    @created 7/9/23 - 9:11 AM   
*/

import lk.ijse.relationships.entity.Lecturer;
import lk.ijse.relationships.entity.Module;
import lk.ijse.relationships.entity.Passenger;
import lk.ijse.relationships.entity.Passport;
import lk.ijse.relationships.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ManyToManyDemo {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
                Session session = sessionFactory.openSession()) {

            Transaction transaction = session.beginTransaction();

            Lecturer gaving = new Lecturer(1l, "Gaving");   //prf, orm
            Lecturer elon = new Lecturer(2l, "Elon");       //dbm, orm

            Module prf = new Module("ITS-001", "Programming Fundamentals");
            Module dbm = new Module("ITS-002", "Database Management Systems");
            Module orm = new Module("ITS-003", "Object Relational Mapping");

            //-----
            gaving.getModuleList().add(prf);
            gaving.getModuleList().add(orm);

            elon.getModuleList().add(dbm);
            elon.getModuleList().add(orm);
            //-----

            //-----
            prf.getLecturerList().add(gaving);
            dbm.getLecturerList().add(elon);
            orm.getLecturerList().add(gaving);
            orm.getLecturerList().add(elon);
            //-----

            session.persist(gaving);
            session.persist(elon);

            session.persist(prf);
            session.persist(dbm);
            session.persist(orm);

            transaction.commit();

        }
    }
}
