package com.geekster.BloggingAPP.Model.DTO;

import com.geekster.BloggingAPP.Model.ENUM.Gender;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserSignInDTO {

    @Email
    private String userEmail;

    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$")
    private String userPassword;
    
    private String userHandle;
    @Enumerated(EnumType.STRING)
    private Gender gender;

}
