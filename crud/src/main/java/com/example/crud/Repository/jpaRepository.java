package com.example.crud.Repository;

import com.example.crud.dao.entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface jpaRepository extends JpaRepository<entity,Long> {

}
