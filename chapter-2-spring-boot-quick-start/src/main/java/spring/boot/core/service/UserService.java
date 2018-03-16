package spring.boot.core.service;


import spring.boot.core.domain.User;

import java.util.List;

/**
 * @author chenbin at 2018/3/16 14:13
 */
public interface UserService {
    List<User> findAll();

    User insertByUser(User user);

    User update(User user);

    User delete(Long id);

    User findById(Long id);
}
