package de.montyx.test.springcloud.guestbookmail;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mail")
public class GuestbookMailController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<?> mail() throws InterruptedException {
        System.out.println("Versende Mail im Mail-Service");
        return ResponseEntity.ok().build();
    }
}
