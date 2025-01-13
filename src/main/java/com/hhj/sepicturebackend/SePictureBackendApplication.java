package com.hhj.sepicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hhj.sepicturebackend.mapper")
public class SePictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(SePictureBackendApplication.class, args);
    }

}
