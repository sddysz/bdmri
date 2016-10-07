package cn.dongyeshengzhen.portal.content.service;

import cn.dongyeshengzhen.framework.model.MsgModel;
import cn.dongyeshengzhen.portal.content.dao.ContentDao;
import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.content.entity.ContentType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Date;
import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Service
public class ContentManager {
    @Autowired
    ContentDao contentDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public Content findOne(Integer id) {
        return contentDao.findOne(id);
    }

    public List<Content> findContents(ContentType type) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Content> criteriaQuery = criteriaBuilder.createQuery(Content.class);
        Root<Content> root = criteriaQuery.from(Content.class);
        criteriaQuery.select(root);
        Predicate condition1 = criteriaBuilder.equal(root.get("type").get("id"), type.getId());
        Predicate condition2 = criteriaBuilder.equal(root.get("isDisplay"), 1);
        Predicate condition=criteriaBuilder.and(condition1,condition2);
        criteriaQuery.where(condition);

        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("orderId")), criteriaBuilder.desc(root.get("updateTime")));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public Content findNewsContent(Integer type) {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Content> criteriaQuery = criteriaBuilder.createQuery(Content.class);
        Root<Content> root = criteriaQuery.from(Content.class);
        criteriaQuery.select(root);
        Predicate condition = criteriaBuilder.equal(root.get("isNews"), type);
        criteriaQuery.where(condition);
        return entityManager.createQuery(criteriaQuery).getResultList().get(0);
    }

    public void save(Content content) {
        content.setCreateTime(new Date());
        if (content.getId() != null) {
            Content tempContent = contentDao.findOne(content.getId());
            content.setCreateTime(tempContent.getCreateTime());
        }
        content.setIsNews(-1);
        content.setUpdateTime(new Date());
        contentDao.save(content);
    }


    public List findAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Content> criteriaQuery = criteriaBuilder.createQuery(Content.class);
        Root<Content> root = criteriaQuery.from(Content.class);
        criteriaQuery.select(root);
        criteriaQuery.orderBy(criteriaBuilder.asc(root.get("orderId")), criteriaBuilder.desc(root.get("updateTime")));
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public MsgModel delete(Integer id) {
        MsgModel msgModel = new MsgModel();
        try {
            contentDao.delete(id);
            msgModel.setStatus(MsgModel.SUCCESS);
            msgModel.setMessage("删除成功");
        } catch (Exception e) {
            msgModel.setStatus(MsgModel.FALSE);
            msgModel.setMessage("删除失败");
            return msgModel;
        }

        return msgModel;
    }
}
