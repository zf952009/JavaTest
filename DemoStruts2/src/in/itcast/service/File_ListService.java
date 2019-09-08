package in.itcast.service;

import in.itcast.domain.File_List;
import org.hibernate.criterion.DetachedCriteria;

import java.util.List;

public interface File_ListService {
    List<File_List> getAll();
    List<File_List> find(File_List file_list);
    List<File_List> find(DetachedCriteria detachedCriteria);
}
