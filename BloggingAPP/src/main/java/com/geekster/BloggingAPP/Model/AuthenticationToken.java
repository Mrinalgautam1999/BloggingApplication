package com.geekster.BloggingAPP.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class AuthenticationToken {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tokenId;
    @NotEmpty
    private String tokenValue;

    private LocalDateTime tokenCreationTime;


    @OneToOne
    private User user;

    public AuthenticationToken(User user) {
        this.user = user;
        this.tokenValue = UUID.randomUUID().toString();
        this.tokenCreationTime = LocalDateTime.now();
    }
}
