package com.geekster.BloggingAPP.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Follower {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer followerId;

    @ManyToOne
    private User user;

    @OneToOne
    private User followers;
}
