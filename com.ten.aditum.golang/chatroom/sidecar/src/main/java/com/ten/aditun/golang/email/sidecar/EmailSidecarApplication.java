package com.ten.aditun.golang.email.sidecar;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

@SpringBootApplication
@EnableDiscoveryClient
@EnableApolloConfig
@EnableSidecar
public class EmailSidecarApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmailSidecarApplication.class, args);
    }
}
