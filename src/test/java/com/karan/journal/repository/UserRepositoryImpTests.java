package com.karan.journal.repository;

import com.karan.journal.entity.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class UserRepositoryImpTests {

    @Autowired UserRepositoryImp userRepositoryImp;

    @Test
    public void testSaveNewUser(){
        Assertions.assertNotNull(userRepositoryImp.getUserForSA());
    }
}
