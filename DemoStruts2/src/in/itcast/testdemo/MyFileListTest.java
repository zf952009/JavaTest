package in.itcast.testdemo;

import in.itcast.domain.File_List;
import in.itcast.service.File_ListService;
import in.itcast.service.impl.File_ListServiceImpl;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.junit.Test;

import java.util.List;

public class MyFileListTest {

    @Test
    public void getAll() {

        File_ListService file_listService = new File_ListServiceImpl();
        List<File_List> all = file_listService.getAll();
        System.out.println(all);
    }

    @Test
    public void find() {
        File_List file_list = new File_List();
        file_list.setId(4);
        System.out.println(file_list);
        File_ListService file_listService = new File_ListServiceImpl();
        List<File_List> all = file_listService.find(file_list);
        System.out.println(file_listService.getAll());
    }

    @Test
    public void find1() {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(File_List.class);
        detachedCriteria.add(Restrictions.or(Restrictions.eq("id", 8), Restrictions.like("name", "jsp")));
//        detachedCriteria.add(Restrictions.like("name", "%jdbc%"));
        File_ListService file_listService = new File_ListServiceImpl();
        List<File_List> list = file_listService.find(detachedCriteria);
        System.out.println(list);
    }

    @Test
    public void find2() {
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.getTransaction();
        transaction.begin();
        Query query = session.createQuery("from File_List where name like  :name");
        Query query1 = session.createQuery("from File_List where id=:id");
        query1.setParameter("id", 2);
        query.setParameter("name", "%jsp%");
        List list = query.list();
        List list1 = query1.list();

        transaction.commit();
        System.out.println(list.size());
        System.out.println(list1.size());
        if (list1.size() == 1) {
            list.add(list.size(), list1.get(0));
        } else {
            System.out.println(list.size());
        }
        System.out.println(list.size());
    }
    @Test
    public void find3(){
        File_ListService fileListService = new File_ListServiceImpl();
        File_List file_list = new File_List();
//        file_list.setId(2);
//        file_list.setName("jsp");

        List<File_List> all = fileListService.find(file_list);
        System.out.println(all.size());
    }
}
