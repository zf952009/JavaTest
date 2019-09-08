package in.itcast.testdemo;

import in.itcast.domain.User;
import in.itcast.service.UserService;
import in.itcast.service.impl.UserServiceImpl;
import org.junit.Test;

public class UserTest {


    @Test
    public void login(){
        User  user = new User();
        user.setUser_name("zoufang");
        user.setUser_password("zoufang");
        UserService userService = new UserServiceImpl();
        try {
            User user1 = userService.UserLogin(user);
            System.out.println(user1);
        }catch (Exception e){
            System.out.println("error"+e);
        }
    }
    

}
