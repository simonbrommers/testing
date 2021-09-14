package com.bromleys.testing.testing;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ClientTests {

    @Autowired
    IService service;
    
    @Test
	void testAdd() {
        assertEquals(3, service.add(1, 2));
	}

}
