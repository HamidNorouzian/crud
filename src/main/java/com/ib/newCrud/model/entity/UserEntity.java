package com.ib.newCrud.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "UserEntity")
@Table(name = "UserEntity")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id ;
    @Column(name = "name")
    private String name ;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "age")
    private String age ;
    @Column(name = "password")
    private String passWord;

}
