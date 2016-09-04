package cn.dongyeshengzhen.framework.security.service;

import cn.dongyeshengzhen.framework.security.dao.MenuDao;
import cn.dongyeshengzhen.framework.security.entity.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongye on 2016/9/4.
 */
@Service
public class MenuManager {
    @Autowired
    MenuDao menuDao;


    public List<Menu> findAll() {
        Sort sort=new Sort(Sort.Direction.ASC,"order");
        return menuDao.findAll(sort);
    }

}
