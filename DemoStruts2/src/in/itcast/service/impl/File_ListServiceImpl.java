package in.itcast.service.impl;

import in.itcast.dao.File_ListDao;
import in.itcast.dao.impl.File_ListDaoImpl;
import in.itcast.domain.File_List;
import in.itcast.service.File_ListService;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public class File_ListServiceImpl implements File_ListService {
    File_ListDao file_listDao = new File_ListDaoImpl();
    @Override
    public List<File_List> getAll() {
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        List<File_List> all = file_listDao.getAll();
        transaction.commit();
        return all;
    }

    @Override
    public List<File_List> find(File_List file_list) {
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        List<File_List> list = file_listDao.find(file_list);
        transaction.commit();
        return list;
    }

    @Override
    public List<File_List> find(DetachedCriteria detachedCriteria) {
        Transaction transaction = HibernateUtils.getCurrentSession().beginTransaction();
        List<File_List> list = file_listDao.find(detachedCriteria);
        transaction.commit();
        return list;
    }
}
