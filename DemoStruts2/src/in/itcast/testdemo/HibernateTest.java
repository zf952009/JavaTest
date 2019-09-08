package in.itcast.testdemo;

import in.itcast.action.Tb_WebAction;
import in.itcast.dao.Tb_WebDao;
import in.itcast.dao.impl.Tb_WebDaoImpl;
import in.itcast.domain.Tb_Web;
import in.itcast.service.Tb_WebService;
import in.itcast.service.impl.Tb_WebServiceImpl;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;

public class HibernateTest {
    @Test
    public void test1(){
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Tb_WebDao tb_web = new Tb_WebDaoImpl();
        List<Tb_Web> all = tb_web.getAll();
        System.out.println(all);
    }
    @Test
    public void test2(){
        Tb_WebService tbWebService = new Tb_WebServiceImpl();
        List<Tb_Web> tbWebServiceAll = tbWebService.getAll();
        System.out.println(tbWebServiceAll);
    }
    @Test
    public void test3(){
        Tb_WebAction tb_webAction = new Tb_WebAction();
        try {
            String list = tb_webAction.list();
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
