package in.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import in.itcast.domain.Tb_Web;
import in.itcast.service.Tb_WebService;
import in.itcast.service.impl.Tb_WebServiceImpl;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class Tb_WebAction extends ActionSupport implements ModelDriven<Tb_Web> {
    private Tb_WebService tb_webService = new Tb_WebServiceImpl();
    private Tb_Web tb_web = new Tb_Web();

    /**
     * 查询所有的数据
     * */
    public String list() throws Exception {
        System.out.println(tb_web);
        //接受参数
        String name = tb_web.getName();
        String url = tb_web.getUrl();
        String web = tb_web.getWeb();
        //离线查询对象
        DetachedCriteria detachedCriteria = DetachedCriteria.forClass(Tb_Web.class);

        //拼装查询条件
        if (name!=null && !"".equals(name)){
            detachedCriteria.add(Restrictions.like("name","%"+name+"%"));
        }
        if (url!=null && !"".equals(url)){
            detachedCriteria.add(Restrictions.like("url","%"+url+"%"));
        }
        if (web!=null && !"".equals(web)){
            detachedCriteria.add(Restrictions.like("web","%"+web+"%"));
        }
        List<Tb_Web> list = tb_webService.getAll();
        System.out.println(list);
        Long size = list.get(list.size()-1).getId();
        ActionContext.getContext().put("size",size+1L);
        ActionContext.getContext().put("list",list);
        return "list";
    }
    /**
     * 添加数据
     * */
    public String  add(){
        tb_webService.save(tb_web);
        return "toList";
    }
    /**
     * 删除数据
     * */
    public String delete(){
       tb_webService.delete(tb_web.getId());
        return "toList";
    }


    @Override
    public Tb_Web getModel() {
        return tb_web;
    }
}
