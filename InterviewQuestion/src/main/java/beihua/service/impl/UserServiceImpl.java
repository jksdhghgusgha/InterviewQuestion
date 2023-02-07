package beihua.service.impl;

import beihua.dao.DetailDao;
import beihua.dao.UserDao;
import beihua.domain.Detail;
import beihua.domain.User;
import beihua.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author :DYH
 * @date :2023/2/7 13:40
 * ClassName :UserServiceImpl
 * Package :beihua.service.impl
 * Description :
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DetailDao detailDao;

    @Autowired
    private UserDao userDao;

    @Override
    public double checkWallet(String id) {
        User user = userDao.selectUser(id);
        return user.getWallet();
    }

    @Override
    public int expend_100(String id) {
        User user = userDao.selectUser(id);
        if (user.getWallet()<100.00) return 0;
        user.setWallet(user.getWallet()-100.00);
        userDao.updateUser(user);
        Detail detail = new Detail(user.getId(),new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()),100.0);
        detailDao.insertDetail(detail);
        return 1;
    }

    @Override
    public int drawBack_20(String id) {
        User user = userDao.selectUser(id);
        user.setWallet(user.getWallet()+20.00);
        userDao.updateUser(user);
        return 1;
    }

    @Override
    public List<Detail> checkDetails(String id) {
        return detailDao.selectDetails(id);
    }
}
