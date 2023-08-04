package com.techjava.springdev;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/req")
public class ControlerCls {

    @GetMapping("/add")
    public ResponseEntity<String> getAdd()
    {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
