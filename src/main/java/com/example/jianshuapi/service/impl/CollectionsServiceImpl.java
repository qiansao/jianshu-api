package com.example.jianshuapi.service.impl;


import com.example.jianshuapi.core.AbstractService;
import com.example.jianshuapi.dao.CollectionsMapper;
import com.example.jianshuapi.service.CollectionsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Collections;

@Service
@Transactional
public class CollectionsServiceImpl extends AbstractService<Collections> implements CollectionsService {
    @Resource
    private CollectionsMapper collectionsMapper;

}
