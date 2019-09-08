package in.itcast.dao;

import in.itcast.domain.Tb_Web;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface Tb_WebDao {
    //保存数据
    void save(Tb_Web tb_web);
    void delete(Tb_Web tb_web);


    List<Tb_Web> getAll();
    List<Tb_Web> getAll(DetachedCriteria detachedCriteria);

    List<Tb_Web> getLimit();

}
