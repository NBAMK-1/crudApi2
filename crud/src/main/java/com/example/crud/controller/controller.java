package com.example.crud.controller;

import com.example.crud.Repository.jpaRepository;
import com.example.crud.dao.entity;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Optional;

@RestController
public class controller {
//    @PersistenceContext
//    EntityManager em;

    @Autowired
    jpaRepository repo;

//    @GetMapping("/test")
//    public String test() {
//        return "hello this is test";
//    }
    @PostMapping("/create")  //c
    public String create(@RequestBody entity newentity){
    repo.save(newentity);
    return "saved in db";
    }

    @GetMapping("/getall") //r
    public List<entity> getAll(){
      return repo.findAll();
    }


    @PutMapping("/update")//u
    public void updateBy(@RequestBody entity upentity){
        Optional<entity> userFromDb = repo.findById(upentity.getId());
        upentity.setName(upentity.getName());
        upentity.setNumber(upentity.getNumber());

        repo.save(upentity);
    }


    @DeleteMapping("/delete/{id}")//d
    public void deleteById(@PathVariable("id") Long id){
        entity t = repo.getById(id);
        repo.delete(t);
    }




}

