package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Service;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.DTO.RegisterDTO;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Model.Users;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Respository.Registry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class RegisterService {

    @Autowired
    Registry Userrepo;

    @Autowired
    BCryptPasswordEncoder encoder;

    public ResponseEntity<?> register(@RequestBody RegisterDTO registerDTO){
        Optional<Users> checker = Userrepo.findByMail(registerDTO.getMail());
        if (checker.isPresent()) return new ResponseEntity<>("User Already Exists", HttpStatus.CONFLICT);

        Users users = new Users();
        users.setAble(5);
        users.setFull_name(registerDTO.getFullname());
        users.setMail(registerDTO.getMail());
        users.setUser_name(registerDTO.getUsername());
        users.setPassword(encoder.encode(registerDTO.getPasswords()));

        Userrepo.save(users);
        return ResponseEntity.ok("Registration Succesfully");


    }
}
