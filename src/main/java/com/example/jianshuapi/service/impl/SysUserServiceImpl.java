package com.example.jianshuapi.service.impl;


import com.example.jianshuapi.core.AbstractService;
import com.example.jianshuapi.dao.SysUserMapper;
import com.example.jianshuapi.model.SysUser;
import com.example.jianshuapi.model.dto.SysUserDTO;
import com.example.jianshuapi.model.vo.SysUserVO;
import com.example.jianshuapi.service.SysUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class SysUserServiceImpl extends AbstractService<SysUser> implements SysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserVO login(SysUserDTO sysUserDTO) {
//        SysUser sysUser = new SysUser();
//        sysUser.setEmail(sysUserDTO.getEmail());
//        SysUser sysUser1 = sysUserMapper.selectOne(sysUser);
//        if(sysUser1!=null){
//            if(sysUser1.getPassword().equals(sysUserDTO.getPassword())){
//                SysUserVO sysUserVO  = new SysUserVO();
//            }
//        }
        return null;
    }
}
