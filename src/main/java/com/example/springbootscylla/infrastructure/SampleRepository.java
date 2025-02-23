package com.example.springbootscylla.infrastructure;

import com.example.springbootscylla.domain.entity.Users;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends CassandraRepository<Users, String> {

}
