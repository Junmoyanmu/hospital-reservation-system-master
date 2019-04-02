package com.hms.application.service;

import com.hms.application.entity.Article;
import com.hms.application.repository.ArticleReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 健康资讯业务功能实现类
 */

@Service
public class ArticleServiceImpl implements ArticleService{
    @Autowired
    ArticleReposity articleReposity;

    @Override
    public List<Article> findByArticleId(Integer articleId) {
        return articleReposity.findByArticleId(articleId);
    }

    @Override
    public List<Article> findByArticleTitle(String articleTitle) {
        return articleReposity.findByArticleTitle(articleTitle);
    }

    @Override
    public List<Article> findByPkDoc(String pkDoc) {
        return articleReposity.findByPkDoc(pkDoc);
    }

    @Override
    public List<Article> findByDocName(String docName) {
        return articleReposity.findByDocName(docName);
    }

    @Override
    public List<Article> findAll() {
        return articleReposity.findAll();
    }

    @Override
    public Article saveAndFlush(Article article) {
        return articleReposity.saveAndFlush(article);
    }

    @Override
    public List<Article> deleteByPkDoc(String pkDoc) {
        return articleReposity.deleteByPkDoc(pkDoc);
    }
}
