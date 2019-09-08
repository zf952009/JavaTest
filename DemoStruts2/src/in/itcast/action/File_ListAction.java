package in.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import in.itcast.domain.File_List;
import in.itcast.domain.MyFile;
import in.itcast.service.File_ListService;
import in.itcast.service.impl.File_ListServiceImpl;
import in.itcast.utils.FileUtils;
import in.itcast.utils.SystemUtils;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class File_ListAction extends ActionSupport {
    //添加文章名
    private String name;
    //搜索文章名
    private String name_search;
    //搜索ID
    private Integer id;
    //添加url
    private String url;
    private String addId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_search() {
        return name_search;
    }

    public void setName_search(String name_search) {
        this.name_search = name_search;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAddId() {
        return addId;
    }

    public void setAddId(String addId) {
        this.addId = addId;
    }

    File_ListService file_listService = new File_ListServiceImpl();

    public String file_list() throws Exception {
        File_List file_list = new File_List();
        System.out.println(id);
        System.out.println(name_search);
        System.out.println(name);
        System.out.println(addId);
        System.out.println(url);
        List<File_List> all = file_listService.find(file_list);
        ActionContext.getContext().put("list", all);
        return "file_list";
    }

    public String file_find() throws Exception {
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(File_List.class);
        //拼装查询对象
        if (name_search != null && "".equals(name_search)) {
            detachedCriteria.add(Restrictions.like("name", "%" + name_search + "%"));
        }
        if (id != null && "".equals(id)) {
            detachedCriteria.add(Restrictions.eq("id", id));
        }
        file_listService.find(detachedCriteria);

        return "file_list";
    }

    public String systemFileList() throws UnsupportedEncodingException {
        String dir = SystemUtils.DESKTOPPATH;
        File file_dir = new File(dir);
        Map<String, List> fileList = FileUtils.getFileList(file_dir);
        List<MyFile> myFilesList = new LinkedList<>();
        List files = fileList.get("files");
        for (int i = 0; i < files.size(); i++) {
            MyFile myFiles = new MyFile();
            String filesUrl = files.get(i).toString();
            String filesName = FileUtils.subFileName(filesUrl);
            myFiles.setType("files");
            myFiles.setFile_url(filesUrl);
            myFiles.setName(filesName);
            ((LinkedList<MyFile>) myFilesList).addLast(myFiles);
        }
        List file = fileList.get("file");
        for (int i = 0; i < file.size(); i++) {
            MyFile myFile = new MyFile();
            String fileUrl = file.get(i).toString();
            String fileName = FileUtils.subFileName(fileUrl);
            String fileType = FileUtils.getFileType(fileUrl);
            myFile.setName(fileName);
            myFile.setFile_url(fileUrl);
            myFile.setType(fileType);
            ((LinkedList<MyFile>) myFilesList).addLast(myFile);
        }
        ActionContext.getContext().put("data", myFilesList);
        return "systemFileList";
    }
}
