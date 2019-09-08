package in.itcast.interceptor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.hibernate.Session;

import java.util.Map;

/**
 * 自定义登录过滤器
 * 每个actio都需要登录过滤，
 * */
public class LoginInterceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        /**
         * 前处理
         * */
        System.out.println("这里是前处理");
        Map<String,Object> map = ActionContext.getContext().getSession();
        Object user = map.get("user");
        if (user==null){
            return "toLogin";
        }else {
            actionInvocation.invoke();
        }
        /**
         * 放行(放行代码分割线)
         *
        actionInvocation.invoke();
         * 后处理
         *
        System.out.println("这里是后处理");
        return "success";*/
        return "success";
    }
}
