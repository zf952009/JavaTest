package in.itcast.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;
/**
 * 自定义拦截器方法1
 * 实现以个接口import com.opensymphony.xwork2.interceptor.Interceptor;
 * 拦截器的生命周期。项目启动而创建，项目关闭而销毁
 * */
public class Fun1Interceptor implements Interceptor {
    @Override
    public void destroy() {
        /**
         * 拦截器销毁后
         * */
    }

    @Override
    public void init() {
        /**
         * 拦截器一些初始化，
         * */

    }

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        /**
         * 拦截器具体实现
         * */
        return null;
    }
}
