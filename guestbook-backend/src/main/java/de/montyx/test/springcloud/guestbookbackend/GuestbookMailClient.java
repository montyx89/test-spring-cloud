package de.montyx.test.springcloud.guestbookbackend;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("guestbook-mail")
public interface GuestbookMailClient {

    @RequestMapping(value = "/mail/", method = RequestMethod.GET)
    void mail();
}
