package com.example.authentication.dao;

import com.example.authentication.model.Permission;
import org.springframework.data.repository.CrudRepository;

public interface PermissionDao extends CrudRepository<Permission,Long> {
}
