package beihua.dao;

import beihua.domain.User;

/**
 * @author :DYH
 * @date :2023/2/7 13:32
 * ClassName :UserDao
 * Package :beihua.dao
 * Description :
 */
public interface UserDao {
    int insertUser(User user);
    User selectUser(String id);
    int deleteUser(String id);
    int updateUser(User user);
}
