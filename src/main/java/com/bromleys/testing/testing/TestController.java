package com.bromleys.testing.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")
public class TestController {
    
    @Autowired
    private IService service;

    @GetMapping("/add/{first}/{second}")
    public ResponseEntity<Integer> add( @PathVariable("first") int first,
     @PathVariable("second") int second ){
        return ResponseEntity.status(HttpStatus.OK).body(service.add(first, second));
     }

}
