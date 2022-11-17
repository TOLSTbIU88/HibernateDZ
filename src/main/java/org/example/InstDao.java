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
            session.saveOrUpdate(user);
            session.getTransaction();
            session.close();
         }
    }
    public void addPost(String text , User user) {
        try (SessionFactory sessionFactory = HibernateConfig.createSessionFactory();
             Session session = sessionFactory.openSession()){
            session.clear();
            session.beginTransaction();
            Post post  = new Post(text,user);
            session.saveOrUpdate(post);
            session.getTransaction();
            session.close();
        }
    }
    public void addCommit(String text ,Post post, User user) {
        try (SessionFactory sessionFactory = HibernateConfig.createSessionFactory();
             Session session = sessionFactory.openSession()){
            session.clear();
            session.beginTransaction();
            Comment comment = new Comment(text,post,user);
            session.saveOrUpdate(comment);
            session.getTransaction();
            session.close();

        }
    }
}
