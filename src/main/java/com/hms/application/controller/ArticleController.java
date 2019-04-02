package com.hms.application.controller;

import com.hms.application.entity.Article;
import com.hms.application.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * 健康资讯控制器
 */

@Controller
public class ArticleController {
    @Autowired
    ArticleService articleService;


//    健康资讯-查找文章
    @RequestMapping(value = "/admin/article_search.html")
    public String articleSearch(Model model) {
        List<Article> articleList = articleService.findAll();
//        将查询结果逆序输出
        Collections.reverse(articleList);
        model.addAttribute("articles", articleList);
        return "admin/article_search";
    }

    @PostMapping(value = "/admin/article/search_submit")
    public String articleSearchSubmit(@RequestParam String searchArticle,
                                      Model model) {
        List<Article> articleList = articleService.findByArticleTitle(searchArticle);
        List<Article> articleList2 = articleService.findByDocName(searchArticle);
//        需要查询结果是否为空
        if (! articleList2.isEmpty()) {
            articleList.addAll(articleList2);
        }
        model.addAttribute("articles", articleList);
        return "admin/article_search";
    }


//    健康资讯-查看/修改文章
    @GetMapping(value = "/admin/article/modify")
    public String articleModify(HttpServletRequest request, Model model) {
//        获取点击的文章ID，查找详细信息，将数据传给详情/修改页面
        Integer articleId = Integer.parseInt(request.getParameter("articleId"));

        /**
         * 改为查找单挑记录的接口
         */
        Article article = articleService.findByArticleId(articleId).get(0);
        model.addAttribute("article", article);

        return "admin/article_modify";
    }

    @PostMapping(value = "/admin/article/modify_submit")
    public String articleModifySubmit(@RequestParam String articleTitle,
                                      @RequestParam String articleText,
                                      @RequestParam String docName,
                                      @RequestParam String pkDoc,
                                      Model model) {
        List<Article> articleList = articleService.findByPkDoc(pkDoc);

        if (articleList.isEmpty()) {
//            查询结果为空，说明修改了医生编号，先删除原有记录再添加
            articleService.deleteByPkDoc(pkDoc);
            Article article = new Article();

            article.setArticleTitle(articleTitle);
            article.setArticleText(articleText);
            article.setDocName(docName);
            article.setPkDoc(pkDoc);
            Date date = new Date();
            article.setArticleTime(date);

            articleService.saveAndFlush(article);
        }
        else {
//            查询结果非空，则直接修改
            Article article = articleList.get(0);

            article.setArticleTitle(articleTitle);
            article.setArticleText(articleText);
            article.setDocName(docName);
            article.setPkDoc(pkDoc);

            articleService.saveAndFlush(article);
        }

        articleList = articleService.findAll();
        model.addAttribute("articles", articleList);

        return "admin/article_search";
    }



//    健康资讯-新建文章
    @RequestMapping(value = "/admin/article_create.html")
    public String articleCreate() {
        return "admin/article_create";
    }

    @PostMapping(value = "/admin/article/create_submit")
    public String articleCreateSubmit(@RequestParam String articleTitle,
                                      @RequestParam String articleText,
                                      @RequestParam String docName,
                                      @RequestParam String pkDoc) {
        /**
         * 需要医生信息数据校验
         **/
        Article article = new Article();
        article.setArticleTitle(articleTitle);
        article.setArticleText(articleText);
        article.setDocName(docName);
        article.setPkDoc(pkDoc);
        Date date = new Date();
        article.setArticleTime(date);

        articleService.saveAndFlush(article);

        return "admin/article_create";
    }
}
