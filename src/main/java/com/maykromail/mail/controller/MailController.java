package com.maykromail.mail.controller;

import com.maykromail.mail.model.MailForm;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Mike on 9/26/2017.
 */
@RestController(value = "/mail")
public class MailController {

    @PostMapping(value = "/send")
    public String sendMail(@RequestBody MailForm mailForm) {
        System.out.println(mailForm.getFrom() + " " + mailForm.getSubject() + " " + mailForm.getBody());
        return "Mail to Maykrobit Sent! Thanks for playing :)";

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String helloWorld() {
        return "Welcome to maykromail.";
    }
}