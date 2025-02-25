package com.example.springbootscylla.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Table(keyspace = "sample", value = "users")
public class Users {

    @PrimaryKey
    @Column(value = "user_id")
    private String userId;

    @Column(value = "first_name")
    private String firstName;

    @Column(value = "last_name")
    private String lastName;

    @Column(value = "age")
    private int age;
}
