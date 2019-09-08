package in.itcast.dao;

import in.itcast.domain.File_List;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface File_ListDao {
    List<File_List> getAll();
    List<File_List> find(File_List file_list);
    List<File_List> find(DetachedCriteria detachedCriteria);
}
