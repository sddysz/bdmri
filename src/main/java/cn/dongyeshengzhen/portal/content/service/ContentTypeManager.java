package cn.dongyeshengzhen.portal.content.service;

import cn.dongyeshengzhen.framework.security.entity.Menu;
import cn.dongyeshengzhen.portal.content.dao.ContentDao;
import cn.dongyeshengzhen.portal.content.dao.ContentTypeDao;
import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Service
public class ContentTypeManager {
    @Autowired
    ContentTypeDao contentTypeDao;

    public ContentType findOne(Integer id) {
        return contentTypeDao.findOne(id);
    }

    public List<Content> findContents(Menu menu) {
        return null;
    }

}
