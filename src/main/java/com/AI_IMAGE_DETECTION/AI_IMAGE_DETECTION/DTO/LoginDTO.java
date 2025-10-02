package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.DTO;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class LoginDTO {
    @Email
    String Email;
    String Password;
}
