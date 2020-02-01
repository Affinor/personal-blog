package com.jin.demo.personalblog.mapper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**博文数据访问层
 * @author wangjin
 */
@Repository
public interface ArticleMapper extends JpaRepository<ArticleDO,Long>, JpaSpecificationExecutor<ArticleDO> {

}
