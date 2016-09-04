package cn.dongyeshengzhen.portal.content.dao;

import cn.dongyeshengzhen.portal.content.entity.Content;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * Created by dongye on 2016/9/4.
 */
@Repository
public interface contentDao extends JpaRepository<Content, Integer>, JpaSpecificationExecutor<Content> {
}
