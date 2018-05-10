package hibernate;

import hibernate.entity.Book;
import hibernate.entity.Writer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {

            Configuration configuration=new Configuration();
            configuration.addAnnotatedClass(Writer.class);
            return  configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());

        //return null;
    }

}
