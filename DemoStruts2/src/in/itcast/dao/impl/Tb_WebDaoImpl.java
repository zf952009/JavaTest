package in.itcast.dao.impl;

import in.itcast.dao.Tb_WebDao;
import in.itcast.domain.Tb_Web;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;

import java.util.List;

public class Tb_WebDaoImpl implements Tb_WebDao {
    @Override
    public void delete(Tb_Web tb_web) {
        Session session = HibernateUtils.getCurrentSession();
        session.delete(tb_web);
    }

    @Override
    public void save(Tb_Web tb_web) {
        Session session = HibernateUtils.getCurrentSession();
        session.save(tb_web);
    }

    @Override
    public List<Tb_Web> getAll() {
        Session session = HibernateUtils.getCurrentSession();
        String hql = "from Tb_Web ";
        //2.根据hql语句查询对象
        Query query = session.createQuery(hql);
        //3.根据查询对象查询结果
        List<Tb_Web> list = query.list();
        return list;
    }
    @Override
    public List<Tb_Web> getAll(DetachedCriteria detachedCriteria){
        Session session = HibernateUtils.getCurrentSession();
        List<Tb_Web> list = detachedCriteria.getExecutableCriteria(session).list();
        return list;
    }

    @Override
    public List<Tb_Web> getLimit(){
        Session session = HibernateUtils.getCurrentSession();
        String hql="from Tb_Web";
        Query query = session.createQuery(hql);
        query.setFirstResult(0);
        query.setMaxResults(5);

        List<Tb_Web> list = query.list();

        return list;
    }
}
