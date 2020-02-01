package com.jin.demo.personalblog.service;

import com.jin.demo.personalblog.mapper.ArticleDO;
import com.jin.demo.personalblog.mapper.ArticleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**博文服务层
 * @author wangjin
 */
@Service
public class ArticleService {
    @Autowired
    ArticleMapper articleMapper;

    /**
     * 分页查询博文
     * @param page 要查询的页码
     * @return
     */
    public List<ArticleDO> selectArticlesByPage(Integer page){
        //当前页
        Integer currentPage = currentPage(page);
        Pageable pageable  = PageRequest.of(currentPage,3);
        return articleMapper.findAll(pageable).getContent();
    }

    /**
     * 当前页
     * @return
     */
    public Integer currentPage(Integer page){
        //总数量
        long count = articleMapper.count();
        //总页数
        long p = count / 3;
        if (null == page || page<0){
            page=0;
        }else if (page>p){
            page=Integer.parseInt(p+"");
        }
        return page;
    }
}
