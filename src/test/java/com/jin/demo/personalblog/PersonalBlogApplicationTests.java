package com.jin.demo.personalblog;

import com.jin.demo.personalblog.mapper.ArticleDO;
import com.jin.demo.personalblog.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PersonalBlogApplicationTests {

    @Autowired
    ArticleMapper articleMapper;
    @Test
    void contextLoads() {
        /*List<ArticleDO> articleDOS = articleMapper.selectArticlesByPage(0, 2);
        articleDOS.forEach(System.out::println);*/
    }

}
