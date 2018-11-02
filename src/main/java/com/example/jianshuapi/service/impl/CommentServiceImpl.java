package com.example.jianshuapi.service.impl;

import com.example.jianshuapi.core.AbstractService;
import com.example.jianshuapi.dao.CommentMapper;
import com.example.jianshuapi.model.Comment;
import com.example.jianshuapi.service.CommentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class CommentServiceImpl extends AbstractService<Comment> implements CommentService {
    @Resource
    private CommentMapper commentMapper;

}
