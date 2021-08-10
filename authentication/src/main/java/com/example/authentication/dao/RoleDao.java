package com.example.authentication.dao;

import com.example.authentication.model.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleDao extends CrudRepository<Role,Long> {
}
