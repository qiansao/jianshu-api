package com.example.jianshuapi.dao;


import com.example.jianshuapi.Tester;
import com.example.jianshuapi.model.vo.ArticleVO;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

public class ArticleMapperTest extends Tester {
    @Resource
    private ArticleMapper articleMapper;

    @Test
    public void getHotArticles() {
        List<ArticleVO> articleVOList = articleMapper.getHotArticles();
        articleVOList.forEach(articleVO -> System.out.println(articleVO));
    }
}