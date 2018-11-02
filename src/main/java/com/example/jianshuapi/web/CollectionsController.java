package com.example.jianshuapi.web;

import com.example.jianshuapi.core.Result;
import com.example.jianshuapi.core.ResultGenerator;
import com.example.jianshuapi.service.CollectionsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/collections")
public class CollectionsController {
    @Resource
    private CollectionsService collectionsService;

    @PostMapping("/add")
    public Result add(@RequestBody Collections collections) {
        collectionsService.save(collections);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        collectionsService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Collections collections) {
        collectionsService.update(collections);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail/{id}")
    public Result detail(@PathVariable Integer id) {
        Collections collections = collectionsService.findById(id);
        return ResultGenerator.genSuccessResult(collections);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Collections> list = collectionsService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
