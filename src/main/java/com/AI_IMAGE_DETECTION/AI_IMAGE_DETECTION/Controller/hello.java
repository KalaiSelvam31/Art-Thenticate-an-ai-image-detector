package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Controller;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Model.Users;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Respository.Registry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class hello {
    @Autowired
    Registry Userrepo;


    @GetMapping("/hellov")
    public List<Users> helo(){
        return Userrepo.findAll();

    }
}
