package in.itcast.service;

import in.itcast.Exception.UserException;
import in.itcast.domain.User;

public interface UserService {
    User UserLogin(User user) throws UserException;
}
