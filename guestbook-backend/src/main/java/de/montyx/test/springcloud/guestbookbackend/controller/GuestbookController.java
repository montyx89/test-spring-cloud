package de.montyx.test.springcloud.guestbookbackend.controller;

import de.montyx.test.springcloud.guestbookbackend.GuestbookMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guestbook")
public class GuestbookController {

    @Value("${eureka.instance.instance-id}")
    private String port;

    @Autowired
    private GuestbookMailService guestbookMailService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String guestbook(){
        System.out.println("Vor der Mail im Controller");
        guestbookMailService.sendMail();
        System.out.println("Nach der Mail im Controller");
        return "Guestbook" + port;
    }
}
