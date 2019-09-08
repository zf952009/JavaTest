package in.itcast.dao.impl;

import in.itcast.dao.UserDao;
import in.itcast.domain.User;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class UserDaoImpl implements UserDao {
    @Override
    public User userGetbyName(String user_name) {
        Session session = HibernateUtils.getCurrentSession();
        String hql = "from User where user_name = :user_name";
        Query<User> query = session.createQuery(hql);
        query.setParameter("user_name",user_name);
        User user = query.uniqueResult();
        return user;
    }
}
