package com.example.jianshuapi.service.impl;


import com.example.jianshuapi.core.AbstractService;
import com.example.jianshuapi.dao.LikeMapper;
import com.example.jianshuapi.model.Like;
import com.example.jianshuapi.service.LikeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class LikeServiceImpl extends AbstractService<Like> implements LikeService {
    @Resource
    private LikeMapper likeMapper;

}
