package cn.dongyeshengzhen.portal.content.service;

import cn.dongyeshengzhen.portal.content.dao.ContentDao;
import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Service
public class ContentManager {
    @Autowired
    ContentDao contentDao;

    public Content findOne(Integer id) {
        return contentDao.findOne(id);
    }

    public List<Content> findContents(ContentType type) {

        return contentDao.findContentByTypeId(type.getId());
    }

}
