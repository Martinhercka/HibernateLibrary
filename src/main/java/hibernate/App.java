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
        Session s = sf.openSession();
        s.beginTransaction();

        Writer writer = new Writer();
        writer.setFirstName("Samo");
        writer.setLastName("Chalupka");

        s.save(writer);
        s.getTransaction().commit();
        s.close();
    }
}
