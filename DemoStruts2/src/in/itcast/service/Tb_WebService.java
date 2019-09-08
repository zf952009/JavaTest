package in.itcast.service;

 import in.itcast.domain.Tb_Web;
 import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface Tb_WebService {
    //保存操作
    void  save(Tb_Web tb_web);
    //删除操作
    void delete(Long id);

    //查询所有操作
    List<Tb_Web> getAll();
    List<Tb_Web> getAll(DetachedCriteria detachedCriteria);

    List<Tb_Web> getLimit(int page, int number);

}
