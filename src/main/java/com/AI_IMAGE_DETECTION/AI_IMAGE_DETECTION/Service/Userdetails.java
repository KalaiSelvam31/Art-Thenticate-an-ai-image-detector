package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Service;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

public class Userdetails implements UserDetails {

    private final Users users;

    public Userdetails(Users users) {
        this.users = users;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getPassword() {
        return users.getPassword();
    }

    @Override
    public String getUsername() {
        return users.getMail();
    }
}
