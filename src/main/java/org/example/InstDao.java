package org.example;


import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InstDao {
    public void addUSER(String name , String password) {
        try (SessionFactory sessionFactory = HibernateConfig.createSessionFactory();
                Session session = sessionFactory.openSession()){
            session.clear();
            session.beginTransaction();
            User user = new User(name,password);
            session.save(user);
            session.getTransaction();
            session.close();
         }
    }
}
