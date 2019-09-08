package in.itcast.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;


public class Demo3Action extends ActionSupport {
    @Override
    public String execute() throws Exception {
        /**
         * 通过ActionContext获取三个域以及赋值
         * request
         * session
         * application
         * */
        Map<String,Object> sessionMap = ActionContext.getContext().getSession();

        System.out.println("zoufang");
        return SUCCESS;
    }
}
