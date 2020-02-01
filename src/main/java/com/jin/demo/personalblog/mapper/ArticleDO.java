package com.jin.demo.personalblog.mapper;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**博文实体对象
 * @author wangjin
 */
@ToString
@Data
@Entity
@Table(name = "t_article")
public class ArticleDO implements Serializable {

    private static final long serialVersionUID = 2582345825879971990L;
    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    /**
     * 文章标题
     */
    String title;
    /**
     * 文章具体内容
     */
    String content;
    /**
     * 发表时间
     */
    Date created;
    /**
     * 修改时间
     */
    Date modified;
    /**
     * 默认分类:文章分类
     */
    String categories;
    /**
     * 文章标签
     */
    String tags;
    /**
     * 是否允许评论:默认1（是）
     * 1.是
     * 0.否
     */
    Integer allowComment;
    /**
     * 文章缩略图
     */
    String thumbnail;
}
