package com.AI_IMAGE_DETECTION.AI_IMAGE_DETECTION.DTO;

import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NonNull;
import jakarta.validation.constraints.Pattern;

@Data
public class RegisterDTO {
    String fullname;
    @Email
    String mail;
    @NonNull
    String username;
    @Pattern(
            regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$",
            message = "Password must contain at least one digit, one lowercase letter, one uppercase letter, one special character, and no whitespace."
    )
    String passwords;
    int able =5;

}
