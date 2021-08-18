package com.example.crud.dao;

import javax.persistence.*;

@Entity
@Table(name = "DB")
public class entity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;

    @Column
    private String name;

    @Column
    private String number;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public entity() {
    }

    public entity(Long id, String name, String number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
}
