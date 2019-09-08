package in.itcast.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * 拦截器创建方法二，继承一个父类，只需要实现intercept()方法即可，
 * import com.opensymphony.xwork2.interceptor.AbstractInterceptor;已经实现了
 *   public void init()
 *   public void destroy()
 *   这两个方法，
 * */
public class Fun2Interceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        return null;
    }
}
