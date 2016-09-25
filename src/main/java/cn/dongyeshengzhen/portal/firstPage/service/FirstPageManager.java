package cn.dongyeshengzhen.portal.firstPage.service;

import cn.dongyeshengzhen.portal.content.entity.Content;
import cn.dongyeshengzhen.portal.firstPage.dao.FirstPageDao;
import cn.dongyeshengzhen.portal.firstPage.entity.FirstPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * Created by dongye on 2016/9/6.
 */
@Service
public class FirstPageManager {
    @Autowired
    FirstPageDao firstPageDao;
    @PersistenceContext(unitName = "user_unit")
    protected EntityManager entityManager;

    public FirstPage findOne(Integer id) {
        return firstPageDao.findOne(id);
    }


    public void save(FirstPage firstPage) {
//        content.setCreateTime(new Date());
//        if (content.getId() != null) {
//            Content tempContent = firstPageDao.findOne(content.getId());
//            content.setCreateTime(tempContent.getCreateTime());
//        }
//        content.setUpdateTime(new Date());
        firstPageDao.save(firstPage);
    }

    public List findBanners(){
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<FirstPage> criteriaQuery = criteriaBuilder.createQuery(FirstPage.class);
        Root<FirstPage> root = criteriaQuery.from(FirstPage.class);
        criteriaQuery.select(root);
        Predicate condition = criteriaBuilder.equal(root.get("type"), "banner");
        criteriaQuery.where(condition);
        return entityManager.createQuery(criteriaQuery).getResultList();
    }

    public List findAll() {
        return firstPageDao.findAll();
    }

}
