package in.itcast.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import in.itcast.domain.User;
import in.itcast.service.UserService;
import in.itcast.service.impl.UserServiceImpl;


public class UserAction extends ActionSupport implements ModelDriven<User> {
    User user = new User();

    UserService userService = new UserServiceImpl();
    @Override
    public User getModel() {
        return user;
    }

    public String login() throws Exception {
       /* User loginUser = userService.UserLogin(user);
        ActionContext.getContext().getSession().put("logingUser",loginUser);
        System.out.println(loginUser);
        System.out.println(222);*/
       System.out.println(user);
       return "toIndex" ;
    }
}
