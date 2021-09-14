package com.bromleys.testing.testing;

import org.springframework.stereotype.Service;

@Service
public class TestService implements IService {

    @Override
    public int add( int a, int b ){
        return a + b;
    }
    
}
