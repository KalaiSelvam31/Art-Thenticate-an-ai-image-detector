package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Controller;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.DTO.RegisterDTO;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Service.RegisterService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registeration {

    @Autowired
    RegisterService RS;

    @PostMapping("/register")
    ResponseEntity<?> NewUser(@Valid @RequestBody RegisterDTO rdt){
        return RS.register(rdt);

    }




}




