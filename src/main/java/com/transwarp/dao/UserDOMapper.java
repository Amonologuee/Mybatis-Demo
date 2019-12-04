package com.transwarp.dao;

import com.transwarp.dataobject.UserDO;

import java.util.List;

public interface UserDOMapper {
    List<UserDO> findAll();
}
