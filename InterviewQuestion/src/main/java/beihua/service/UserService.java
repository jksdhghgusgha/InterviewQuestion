package beihua.service;

import beihua.domain.Detail;

import java.util.List;

/**
 * @author :DYH
 * @date :2023/2/7 13:31
 * ClassName :UserService
 * Package :beihua.service
 * Description :
 */
public interface UserService {
    double checkWallet(String id);
    int expend_100(String id);
    int drawBack_20(String id);
    List<Detail> checkDetails(String id);
}
