package com.hms.application.repository;

import com.hms.application.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * JPA数据库交互接口
 */
public interface ArticleReposity extends JpaRepository<Article, Integer> {
//    根据资讯ID查找
    List<Article> findByArticleId(Integer articleId);

//    根据资讯标题查找
    List<Article> findByArticleTitle(String articleTitle);

//    根据医生编号查找
    List<Article> findByPkDoc(String pkDoc);

//    根据医生名查找
    List<Article> findByDocName(String docName);

    Article saveAndFlush(Article article);

    List<Article> findAll();

//    根据医生编号删除
    List<Article> deleteByPkDoc(String pkDoc);
}
