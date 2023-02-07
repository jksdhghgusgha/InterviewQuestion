package beihua.dao;

import beihua.domain.Detail;

import java.util.List;

/**
 * @author :DYH
 * @date :2023/2/7 13:41
 * ClassName :DetailDao
 * Package :beihua.dao
 * Description :
 */
public interface DetailDao {
    int insertDetail(Detail detail);
    List<Detail> selectDetails(String id);
}
