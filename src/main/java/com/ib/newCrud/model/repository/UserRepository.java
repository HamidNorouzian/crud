package com.ib.newCrud.model.repository;

import com.ib.newCrud.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<UserEntity , Long> {

    public List<UserEntity> findAll();
}
