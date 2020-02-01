package com.jin.demo.personalblog.controller;

import com.jin.demo.personalblog.mapper.ArticleDO;
import com.jin.demo.personalblog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @author wangjin
 */
@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;

    /**
     * 分页查询
     * @param page 查询页码
     * @return
     */
    @GetMapping("/article/selectByPage")
    @ResponseBody
    public ModelAndView selectArticlesByPage(Integer page){
        List<ArticleDO> articleDOS = articleService.selectArticlesByPage(page);
        ModelAndView mav = new ModelAndView();
        mav.addObject("articleDOList",articleDOS);
        //保存当前页
        mav.addObject("page",articleService.currentPage(page));
        mav.setViewName("index");
        return mav;
    }
}