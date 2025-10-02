package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Respository;

import com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Model.Users;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Registry extends JpaRepository<Users, Integer> {
    Optional<Users> findByMail(String mail);
}
