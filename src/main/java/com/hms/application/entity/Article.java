package com.hms.application.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * 健康资讯实体类
 */
@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer articleId;                              // 资讯编号，自增

    @Column(length = 64)
    private String articleTitle;                            // 资讯标题

    @Lob
    @Column(columnDefinition = "text")
    private String articleText;                             // 资讯文本内容

    @Column
    private Date articleTime;                               // 资讯发布时间

    @Column
    private String pkDoc;                                   // 医生编号

    @Column
    private String docName;                                 // 医生姓名

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public void setArticleText(String articleText) {
        this.articleText = articleText;
    }

    public void setArticleTime(Date articleTime) {
        this.articleTime = articleTime;
    }

    public String getPkDoc() {
        return pkDoc;
    }

    public String getDocName() {
        return docName;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public String getArticleText() {
        return articleText;
    }

    public Date getArticleTime() {
        return articleTime;
    }

    public void setPkDoc(String pkDoc) {
        this.pkDoc = pkDoc;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }
}
