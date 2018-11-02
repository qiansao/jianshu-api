package com.example.jianshuapi.web;


import com.example.jianshuapi.core.Result;
import com.example.jianshuapi.core.ResultGenerator;
import com.example.jianshuapi.model.Like;
import com.example.jianshuapi.service.LikeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/like")
@CrossOrigin("http://localhost")
public class LikeController {
    @Resource
    private LikeService likeService;

    @PostMapping("/add")
    public Result add(@RequestBody Like like) {
        likeService.save(like);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        likeService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Like> list = likeService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
