package com.motaharinia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.motaharinia"})
public class SecurityOauth2ClientGoogleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityOauth2ClientGoogleApplication.class, args);
    }

}
