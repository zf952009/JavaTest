package in.itcast.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/*
* 工具类
*
* */
public class HibernateUtils {
    private static SessionFactory sessionFactory=null;
    static {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
    }
    //获取全新的session
    public static Session openSession(){
        return sessionFactory.openSession();
    }

    //获取与线程绑定的session
    public static Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }
}
