package in.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import in.itcast.domain.Regular;
import in.itcast.service.RegularSerivce;
import in.itcast.service.impl.RegularSerivceImpl;

import java.util.List;


public class RegularAction extends ActionSupport implements ModelDriven<Regular> {
    Regular regular = new Regular();

    RegularSerivce regularSerivce = new RegularSerivceImpl();

    /***
     * 查询所有
     */
    public String list() throws Exception {
        List<Regular> list = regularSerivce.getAll();
        Long size = list.get(list.size() - 1).getId();
        ActionContext.getContext().put("list", list);
        ActionContext.getContext().put("size", size);
        return "list";
    }

    /**
     * 添加
     */
    public String add() {
        System.out.println(regular.isNull());
        if (regular.isNull()) {
            regularSerivce.save(regular);
            return "toList";
        } else {
            return "addError";
        }
    }

    /**
     * 删除功能
     */
    public String delete() {
        regularSerivce.delete(regular.getId());
        return "toList";
    }

    @Override
    public Regular getModel() {
        return regular;
    }
}
