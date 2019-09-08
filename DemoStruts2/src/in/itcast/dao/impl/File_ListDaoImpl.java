package in.itcast.dao.impl;

import in.itcast.dao.File_ListDao;
import in.itcast.domain.File_List;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @title
 * @param
 * @param
 */
public class File_ListDaoImpl implements File_ListDao {
    //查询所有
    @Override
    public List<File_List> getAll() {
        Session session = HibernateUtils.getCurrentSession();
        List from_file_list_ = session.createQuery("from File_List ").list();
        return from_file_list_;
    }

    //实体对象查询
    @Override
    public List<File_List> find(File_List file_list) {
        Session session = HibernateUtils.getCurrentSession();
        List<File_List> id_list = new LinkedList<>();
        List<File_List> name_list = new ArrayList<>();
        Integer id = file_list.getId();
        String name = file_list.getName();
        if (id == null && name == null) {
            return this.getAll();
        }
        if ("".equals(name) && "".equals(id)){
            return this.getAll();
        }
        if (!"".equals(id) && id != null) {
            Query query = session.createQuery("from File_List where id=:id");
            id_list = query.setParameter("id", id).list();
        }
        if (!"".equals(name) && name != null) {
            Query query = session.createQuery("from File_List where name like :name");
            name_list = query.setParameter("name", "%" + name + "%").list();
        }
        int id_size = id_list.size();
        int name_size = name_list.size();
        if (id_size == 1 && name_size >= 1) {
            name_list.add(name_size, id_list.get(0));
        }
        if (id_size == 1 && name_size == 0) {
            return id_list;
        }
        if (id_size == 0 && name_size >= 1) {
            return name_list;
        }
        if (id_size==0 && name_size==0){
            return  this.getAll();
        }
        return name_list;
    }

    //离线对象查询
    @Override
    public List<File_List> find(DetachedCriteria detachedCriteria) {
        Session session = HibernateUtils.getCurrentSession();
        List list = detachedCriteria.getExecutableCriteria(session).list();
        return list;
    }
}
