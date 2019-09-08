package in.itcast.dao.impl;

import in.itcast.dao.RegularDao;
import in.itcast.domain.Regular;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;

import java.util.List;

public class RegularDaoImpl implements RegularDao {
    @Override
    public void delete(Regular regular) {
        Session session = HibernateUtils.getCurrentSession();
        session.delete(regular);
    }

    /**
     * 保存数据
     *
     * @param regular
     */
    @Override
    public void save(Regular regular) {
        Session session = HibernateUtils.getCurrentSession();
        session.save(regular);

    }

    /**
     * 查询到所有的数据
     */
    @Override
    public List<Regular> getAll() {
        return  HibernateUtils.getCurrentSession().createQuery("from Regular ").list();
    }
}
