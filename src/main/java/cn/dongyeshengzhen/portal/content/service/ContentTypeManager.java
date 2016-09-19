package cn.dongyeshengzhen.portal.content.service;

import cn.dongyeshengzhen.portal.content.dao.ContentTypeDao;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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

    public ContentType findOne(String name) {
        return contentTypeDao.findByName(name);
    }

    public ContentType save(ContentType contentType) {

        contentType.setCreateTime(new Date());
        if (contentType.getId() != null) {
            ContentType tempContentType = contentTypeDao.findOne(contentType.getId());
            contentType.setCreateTime(tempContentType.getCreateTime());
        }
        contentType.setUpdateTime(new Date());
        return contentTypeDao.save(contentType);
    }

    public List<ContentType> findAll() {
        return contentTypeDao.findAll();
    }

    public void delete(Integer id) {
        contentTypeDao.delete(id);
    }
}
