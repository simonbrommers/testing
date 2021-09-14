package com.bromleys.testing.testing;

import org.springframework.beans.factory.annotation.Autowired;

public class Client {

    @Autowired IService service;

    public Client(){
    }

    public int add( int a, int b ){
        return service.add(a, b);
    }

}
