package com.example.springbootscylla.domain.entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@Table(keyspace = "sample", value = "users")
public class Users {
    @PrimaryKey
    private String userId;
    private String firstName;
    private String lastName;
    private int age;
}
