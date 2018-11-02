package com.example.jianshuapi.service;


import com.example.jianshuapi.core.Service;
import com.example.jianshuapi.model.Article;
import com.example.jianshuapi.model.vo.ArticleVO;

import java.util.List;


public interface ArticleService extends Service<Article> {
    List<ArticleVO> getHotArticles();
}
