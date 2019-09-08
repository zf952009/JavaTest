package in.itcast.dao;

import in.itcast.domain.Regular;

import java.util.List;

public interface RegularDao {

    /**
     * 保存数据
     * */
    void save(Regular regular);
    /**
     * 查询到所有的数据
     * */
    List<Regular> getAll();
    void delete(Regular regular);
}
