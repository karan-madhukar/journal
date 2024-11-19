package com.karan.journal.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTests {

    @Autowired
    private EmailService emailService;

//    @Disabled
//    @Test
//    public void testSendEmail() {
//     emailService.sendSimpleMail("wrongemail@gmail.com", "Java journal App", "Java");
//    }
}
