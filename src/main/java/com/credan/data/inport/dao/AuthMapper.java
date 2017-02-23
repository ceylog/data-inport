package com.credan.data.inport.dao;

import com.credan.data.inport.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author Sam Wang
 * @Date 2017/2/23.
 * @Version 0.0.1
 */
public interface AuthMapper {

    List<Role> getRolesByAccountId(@Param("accountId") String accountId);
}
