package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Service;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.DTO.LoginDTO;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Model.Users;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Respository.Registry;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    Registry registry;
    @Autowired
    BCryptPasswordEncoder encode;

    public ResponseEntity<?> loginuser(LoginDTO loginDTO){


        Optional<Users> u = registry.findByMail(loginDTO.getEmail());
        if( encode.matches(loginDTO.getPassword(), u.get().getPassword())){
            System.out.println(true);
            return ResponseEntity.ok("hi");
        }
        else {

            return new ResponseEntity<>(u, HttpStatus.NOT_ACCEPTABLE);}


    }
}
