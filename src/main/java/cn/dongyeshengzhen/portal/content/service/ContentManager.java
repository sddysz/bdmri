package cn.dongyeshengzhen.portal.content.service;

import cn.dongyeshengzhen.portal.content.dao.ContentDao;
import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.util.Date;
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

    public void save(Content content) {
        content.setCreateTime(new Date());
        if (content.getId() != null) {
            Content tempContent = contentDao.findOne(content.getId());
            content.setCreateTime(tempContent.getCreateTime());
        }
        content.setUpdateTime(new Date());
        contentDao.save(content);
    }


    public List findAll() {
    return contentDao.findAll();
    }

}
