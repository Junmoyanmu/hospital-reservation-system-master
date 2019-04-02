package com.hms.application.service;

import com.hms.application.entity.Article;

import java.util.List;

/**
 * 健康资讯业务功能接口
 */
public interface ArticleService {
//    根据资讯ID查找
    List<Article> findByArticleId(Integer articleId);

//    根据资讯标题查找
    List<Article> findByArticleTitle(String articleTitle);

//    根据医生编号查找
    List<Article> findByPkDoc(String pkDoc);

//    根据医生名查找
    List<Article> findByDocName(String docName);

    List<Article> findAll();

    Article saveAndFlush(Article article);

//    根据医生编号删除
    List<Article> deleteByPkDoc(String pkDoc);
}
