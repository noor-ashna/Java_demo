package com.example.demo.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.MyDTO;
import com.example.demo.service.MyService;

@RestController("/api/my/v1")
public class MyController {
	
	@Autowired
	private MyService myService;

    @PostMapping("/map-json")
    public ResponseEntity<String> mapJsonToDto(@RequestBody MyDTO myDTO) throws IOException {

        return ResponseEntity.ok(myDTO.toString());
    }
    
    
    @PostMapping("/create")
    public ResponseEntity<String> create(@RequestBody MyDTO myDTO) throws IOException {
       
    	MyDTO myDTOSaved = myService.create(myDTO);
  
        return  ResponseEntity.ok(myDTOSaved.toString());
       // return ResponseEntity.ok(jsonResult);
    }
    
    @GetMapping("/get/{id}")
    public MyDTO get(@PathVariable("id") Integer myId) throws IOException {
       
    	MyDTO myDTOSaved = myService.findById(myId);
  
        return  myDTOSaved;
       // return ResponseEntity.ok(jsonResult);
    }
}
