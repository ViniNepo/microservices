package com.vinicius.cursos.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class HrWorkerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HrWorkerApplication.class, args);
    }

}
