package de.montyx.test.springcloud.guestbookbackend.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guestbook")
public class GuestbookController {

    @Value("${eureka.instance.instance-id}")
    private String port;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String guestbook(){
        return "Guestbook" + port;
    }
}
