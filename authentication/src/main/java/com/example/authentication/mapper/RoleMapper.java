package com.example.authentication.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.repository.query.Param;

import java.util.Set;

@Mapper
public interface RoleMapper {
   @Select("SELECT p.name " +
           "from permission p inner join role_permission rp " +
           "on p.id= rp.permission_id where rp.role_id = #{role_id}")
   Set<String> getPermissionByRoleId(@Param("role_id") Long roleId);
}
