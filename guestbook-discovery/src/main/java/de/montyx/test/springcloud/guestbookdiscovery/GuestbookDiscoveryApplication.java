package de.montyx.test.springcloud.guestbookdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class GuestbookDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestbookDiscoveryApplication.class, args);
    }
}
