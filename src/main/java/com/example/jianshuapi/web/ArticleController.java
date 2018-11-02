package com.example.jianshuapi.web;

import com.example.jianshuapi.core.Result;
import com.example.jianshuapi.core.ResultGenerator;
import com.example.jianshuapi.model.Article;
import com.example.jianshuapi.model.vo.ArticleVO;
import com.example.jianshuapi.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Resource
    private ArticleService articleService;

    @PostMapping("/add")
    public Result add(@RequestBody Article article) {
        articleService.save(article);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        articleService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Article article) {
        articleService.update(article);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail/{id}")
    public Result detail(@PathVariable Integer id) {
        Article article = articleService.findById(id);
        return ResultGenerator.genSuccessResult(article);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Article> list = articleService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @PostMapping("/hot")
    public Result hot() {
        List<ArticleVO> articleVOS = articleService.getHotArticles();
        return ResultGenerator.genSuccessResult(articleVOS);
    }
}
