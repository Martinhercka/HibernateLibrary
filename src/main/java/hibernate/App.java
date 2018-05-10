package hibernate;

import hibernate.entity.Writer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session se = sf.openSession();
        se.beginTransaction();
        Writer writer = new Writer();
        writer.setFirstName("Samo");
        writer.setLastName("Chalupka");
        se.save(writer);
        se.getTransaction().commit();
        se.close();
    }
}
