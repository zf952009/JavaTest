package in.itcast.interceptor;


import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

/**
 * 拦截器实现方式三
 * 继承;import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;方法过滤器
 * 可以定制拦截器拦截的指定的方法，可以指定哪些方法需要拦截，哪些方法不需要拦截，通过配置实现
 * */
public class Fun3Interceptor extends MethodFilterInterceptor {
    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        return null;
    }
}
