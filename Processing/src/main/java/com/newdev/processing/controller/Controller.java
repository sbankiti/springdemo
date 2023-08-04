package com.newdev.processing.controller;

import com.newdev.processing.Service.ProcessBaby;
import com.newdev.processing.dto.BabyDto;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/process")
public class Controller {

    @Autowired
    ProcessBaby probaby;

    Logger log = LogManager.getLogger(Controller.class);

    /*@GetMapping("/getdata")
    public ResponseEntity getRequest() {

        return new ResponseEntity(clm.buildData(), HttpStatus.OK);
    }

    @GetMapping("/getdata/{id}")
    public ResponseEntity getRequestId(@PathVariable(value = "id") int id) {

        return new ResponseEntity(clm.buildWithId(id), HttpStatus.OK);
    }

    @GetMapping("/getdata/reqparam")
    public ResponseEntity getRequestObj(@RequestParam(value = "id") int id) {

        return new ResponseEntity(clm.buildWithId(id), HttpStatus.OK);
    }

    @GetMapping("/getdata/reqbody")
    public ResponseEntity getRequestBody(@RequestBody() babyname objDto)  {

        try{
            return new ResponseEntity(clm.buildWithObj(objDto), HttpStatus.OK);
        }catch (ExceptionCls ex){
     *//*       babyname pro = new babyname(10,ex.getMessage());*//*
            return new ResponseEntity<>(,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/

    @PostMapping("/postdata")
    public ResponseEntity postData(@RequestBody BabyDto babyReqData)
    {

        log.info("Controller:postData. entered postmapping");
        return probaby.buildData(babyReqData);
    }
}
