package in.itcast.service.impl;

import in.itcast.Exception.UserException;
import in.itcast.dao.UserDao;
import in.itcast.dao.impl.UserDaoImpl;
import in.itcast.domain.User;
import in.itcast.service.UserService;
import in.itcast.utils.HibernateUtils;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserServiceImpl implements UserService  {
    UserDao userDao = new UserDaoImpl();
    @Override
    public User UserLogin(User user) throws UserException {
        //与dao交互，开启事务
        Session session = HibernateUtils.getCurrentSession();
        Transaction transaction  = session.beginTransaction();
        User loginUser = userDao.userGetbyName(user.getUser_name());
        //提交事务
        transaction.commit();

        //有返回值即用户名存在
        if(loginUser==null){
           throw new UserException("用户名不存在");
        }
        //密码判断
        if (!user.getUser_password().equals(loginUser.getUser_password())){
            throw new UserException("密码不一致");
        }
        return loginUser;
    }
}
