package in.itcast.service;

import in.itcast.domain.Regular;

import java.util.List;

public interface RegularSerivce {
    /**
     * 保存数据
     * */
    void save(Regular regular);
    /**
     * 查询到所有的数据
     * */
    List<Regular> getAll();

    /**
     * 删除数据
     * */
    void delete(Long id);
}
