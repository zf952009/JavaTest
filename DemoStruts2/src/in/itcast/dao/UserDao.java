package in.itcast.dao;

import in.itcast.domain.User;

public interface UserDao {
    //根据用户名查找
    User userGetbyName(String user_name);
}
