package com.geekster.BloggingAPP.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @NotEmpty
    private String commentBody;

    private LocalDateTime commentCreationTimeStamp;

    @ManyToOne
    private User commenter;

    @ManyToOne
    private Post postOwner;

}
