package com.example.springbootscylla.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackages = "com.example.springbootscylla.infrastructure")
public class CassandraConfig extends AbstractCassandraConfiguration {

    @Override
    protected String getKeyspaceName() {
        return "sample"; // 생성한 keyspace 이름
    }

    @Override
    public String getContactPoints() {
        return "localhost"; // ScyllaDB가 실행 중인 호스트
    }

    @Override
    public int getPort() {
        return 9042; // ScyllaDB의 기본 포트
    }

//    @Override
//    protected String getLocalDatacenter() {
//        // 에러 메시지에서 언급된 데이터 센터 이름을 명시
//        return "datacenter1";
//    }

    // 추가적인 옵션이 필요하면, getSchemaAction() 등의 메서드를 오버라이드할 수 있습니다.
}

