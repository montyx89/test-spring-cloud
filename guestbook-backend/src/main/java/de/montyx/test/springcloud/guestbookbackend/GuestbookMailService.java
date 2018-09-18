package de.montyx.test.springcloud.guestbookbackend;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.command.AsyncResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class GuestbookMailService {

    @Autowired
    private GuestbookMailClient guestbookMailClient;

    @HystrixCommand(fallbackMethod = "defaultMail")
    public Future<Boolean> sendMail() {
        return new AsyncResult<Boolean>() {

            @Override
            public Boolean invoke() {
                System.out.println("Vor der Mail");
                try {
                  guestbookMailClient.mail();
                } catch (Exception e) {
                    System.out.println(e);
                }
                System.out.println("Nach der Mail");
                return true;
            }
        };
    }

    private Boolean defaultMail() {
        System.out.println("Fehler!!!");
        return false;
    }
}
