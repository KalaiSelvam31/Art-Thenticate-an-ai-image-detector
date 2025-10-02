package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Service;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Model.Users;
import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Respository.Registry;
import jakarta.validation.constraints.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserDetailSerivce implements UserDetailsService {

    @Autowired
    Registry Userrepo;

    @Override
    public UserDetails loadUserByUsername(String Mail) throws UsernameNotFoundException {
        Users out = Userrepo.findByMail(Mail).orElseThrow(()-> new UsernameNotFoundException("User not found"));

        return new Userdetails(out);
    }
}
