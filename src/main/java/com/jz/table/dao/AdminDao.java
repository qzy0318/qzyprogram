package com.jz.table.dao;

import com.jz.table.entity.Admin;

public interface AdminDao {
    //登录判断
    Admin login(Admin admin);
    //注册
    int addAdmin(Admin admin);
}