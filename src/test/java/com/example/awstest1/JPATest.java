package com.example.awstest1;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JPATest {
    @BeforeAll
    static void beforeAll(){
        System.out.println("before 출력");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("after 출력");
    }
}
