package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   private int user_id;
    private String full_name;

   private String mail;
    private String user_name;
   private String password;

    private int able=5 ;




}
