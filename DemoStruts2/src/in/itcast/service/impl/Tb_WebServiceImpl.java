package in.itcast.service.impl;

import in.itcast.dao.Tb_WebDao;
import in.itcast.dao.impl.Tb_WebDaoImpl;
import in.itcast.domain.Tb_Web;
import in.itcast.service.Tb_WebService;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public class Tb_WebServiceImpl implements Tb_WebService {
    Tb_WebDao tb_webDao = new Tb_WebDaoImpl();
    @Override
    public void save(Tb_Web tb_web) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        tb_webDao.save(tb_web);
        transaction.commit();
    }

    @Override
    public void delete(Long id) {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Tb_Web tb_web = new Tb_Web();
        tb_web.setId(id);
        tb_webDao.delete(tb_web);
        transaction.commit();
    }

    @Override
    public List<Tb_Web> getAll() {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<Tb_Web> list = tb_webDao.getAll();
        transaction.commit();
        return list;
    }
    @Override
    public List<Tb_Web> getAll(DetachedCriteria detachedCriteria){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        List<Tb_Web> list = tb_webDao.getAll(detachedCriteria);
        transaction.commit();
        return list;
    }


    @Override
    public List<Tb_Web> getLimit(int page, int number) {
        return null;
    }
}
