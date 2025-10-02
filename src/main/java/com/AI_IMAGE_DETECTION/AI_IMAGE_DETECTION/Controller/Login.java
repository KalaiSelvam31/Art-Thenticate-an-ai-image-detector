package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Controller;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.DTO.LoginDTO;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Service.LoginService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Login {
    @Autowired
    LoginService loginService;

    @PostMapping("/Login")
    ResponseEntity<?>login (@Valid @RequestBody LoginDTO loginDTO){
        return loginService.loginuser(loginDTO);
    }


}
