package com.example.jianshuapi.service.impl;


import com.example.jianshuapi.core.AbstractService;
import com.example.jianshuapi.dao.ArticleMapper;
import com.example.jianshuapi.model.Article;
import com.example.jianshuapi.model.vo.ArticleVO;
import com.example.jianshuapi.service.ArticleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class ArticleServiceImpl extends AbstractService<Article> implements ArticleService {
    @Resource
    private ArticleMapper articleMapper;

    @Override
    public List<ArticleVO> getHotArticles() {
        return articleMapper.getHotArticles();
    }
}
