package in.itcast.service.impl;

import in.itcast.dao.RegularDao;
import in.itcast.dao.impl.RegularDaoImpl;
import in.itcast.domain.Regular;
import in.itcast.service.RegularSerivce;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class RegularSerivceImpl implements RegularSerivce {
    RegularDao regularDao = new RegularDaoImpl();

    /**
     * 删除数据
     *
     * @param id
     */
    @Override
    public void delete(Long id) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Regular regular = session.get(Regular.class,id);
        regularDao.delete(regular);

        transaction.commit();
    }

    /**
     * 保存数据
     *
     * @param regular
     */
    @Override
    public void save(Regular regular) {

        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        regularDao.save(regular);

        transaction.commit();
    }

    /**
     * 查询到所有的数据
     */
    @Override
    public List<Regular> getAll() {
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        List<Regular> list = regularDao.getAll();
        transaction.commit();
        return list;
    }
}
