package org.example;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        try (SessionFactory sessionFactory = HibernateConfig.createSessionFactory();
             Session session = sessionFactory.openSession();) {
            session.beginTransaction();
            User Nikolay = new User("Nikolay","234");
            User Vasilii = new User("Vasilii","23434");
            Post post = new Post("Предлогаю выпить",Nikolay);
            Post post2 = new Post("Заколебали бухать",Vasilii);
            Comment comment = new Comment("Не вижу повода не выпить",post,Nikolay);
            Comment comment2 = new Comment("Не согласен",post2,Vasilii);
            session.saveOrUpdate(Nikolay);
            session.saveOrUpdate(Vasilii);
            session.saveOrUpdate(post);
            session.saveOrUpdate(post2);
            session.saveOrUpdate(comment);
            session.saveOrUpdate(comment2);
            session.getTransaction().commit();
            session.clear();

        }
    }
}