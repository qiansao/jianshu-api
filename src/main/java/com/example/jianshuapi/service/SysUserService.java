package com.example.jianshuapi.service;


import com.example.jianshuapi.core.Service;
import com.example.jianshuapi.model.SysUser;
import com.example.jianshuapi.model.dto.SysUserDTO;
import com.example.jianshuapi.model.vo.SysUserVO;

public interface SysUserService extends Service<SysUser> {
    SysUserVO login(SysUserDTO sysUserDTO);
}
