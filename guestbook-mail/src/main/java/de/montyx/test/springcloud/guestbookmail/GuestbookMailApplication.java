package de.montyx.test.springcloud.guestbookmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GuestbookMailApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestbookMailApplication.class, args);
    }
}
