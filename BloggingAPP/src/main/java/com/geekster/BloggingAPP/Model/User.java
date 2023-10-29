package com.geekster.BloggingAPP.Model;


import com.geekster.BloggingAPP.Model.ENUM.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userEmail;
    private String userPassword;
    private String userHandle;
    @Enumerated(EnumType.STRING)
    private Gender gender;


}
