package org.example;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class InstDao {
    public void addUSER(User user) {
        Session session = Runner.getSessionFactory().openSession();
        Transaction start = session.beginTransaction();
        session.save(user);
        start.commit();
        session.close();
    }

}
