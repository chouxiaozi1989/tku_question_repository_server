package com.ojs.question_repository;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ojs.question_repository.mapper")
public class QuestionRepositoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuestionRepositoryApplication.class, args);
    }

}
