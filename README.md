# ORM Concept ~ Hibernate
### Official Documentation for the Hibernate. 📚
- [hibernate.org/orm](https://hibernate.org/orm/)
- [Hibernate ORM 6.2.6 Final User Guide](https://docs.jboss.org/hibernate/stable/orm/userguide/html_single/Hibernate_User_Guide.html)

### Key Sections. 🚩
- [Hibernate Diagram.pdf](/hibernate-diagrams.pdf)
- [Native hibernate bootstrapping](/native-hibernate/nh-bootstrapping/)
- [CRUD operations](/native-hibernate/crud-opertions)
- [Relationships (One2One | One2Many | Many2Many)](/native-hibernate/nh-relationships)
- [Javafx-fxml with Hibernate](/native-hibernate/fx-hibernate)
- [Query Languages (HQL Vs. SQL)](/native-hibernate/hb-query-language)

### How to get Repository.
1. Install Git on your computer: https://git-scm.com/downloads
2. Then on your terminal. Run 👇

```sh
git clone https://github.com/DanujaV/hibernate-and-jpa-cmjd100.git
```

###### Session Factory
```sh
//import lk.ijse.query.entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {    //Session Factory
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
        //      .configure("/hibernate.cfg.xml")
                .loadProperties("/application.properties")
                .build();

        Metadata metadata = new MetadataSources(standardRegistry)
        //       .addAnnotatedClass(Customer.class)
                .getMetadataBuilder()
                .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                .build();

        SessionFactory sessionFactory = metadata.getSessionFactoryBuilder()
                .build();

        return sessionFactory;
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
```
###### Factory Configuration
- XML Configuration
```sh
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
    "-//Hibernate/Hibernate Configuration DTD//EN"
    "http://www.hibernate.org/dtd/hibernate-configuration-3.0.dtd">
<hibernate-configuration>
  <session-factory>
    <property name="hibernate.dialect">org.hibernate.dialect.MySQLDialect</property>
    <property name="hibernate.connection.driver_class">com.mysql.cj.jdbc.Driver</property>
    <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/nh_cmjd100?createDatabaseIfNotExist=true</property>
    <property name="hibernate.connection.username">root</property>
    <property name="hibernate.connection.password">password</property>
    <property name="hibernate.show_sql">true</property>
    <property name="hibernate.format_sql">true</property>
    <property name="hibernate.hbm2ddl.auto">update</property>-->
  </session-factory>
</hibernate-configuration>
```
OR
- Resource Bundle Configuration
```sh
#key=value pairing

hibernate.dialect=org.hibernate.dialect.MySQLDialect
hibernate.connection.driver_class=com.mysql.cj.jdbc.Driver
hibernate.connection.url=jdbc:mysql://localhost:3306/cmjd100_thogakade?createDatabaseIfNotExist=true
hibernate.connection.username=root
hibernate.connection.password=password
hibernate.show_sql=true
hibernate.format_sql=true
hibernate.hbm2ddl.auto=update
```

### License. 🛡️
Copyright 2023 CMJD. All Rights Reserved.