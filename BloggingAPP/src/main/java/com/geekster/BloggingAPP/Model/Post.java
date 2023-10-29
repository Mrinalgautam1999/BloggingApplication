package com.geekster.BloggingAPP.Model;

import com.geekster.BloggingAPP.Model.ENUM.PostType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;
    @NotEmpty
    private String postContent;
    @NotNull
    private String postCaption;

    private String postLocation;
    @Enumerated(value = EnumType.STRING)
    private PostType postType;
    private String postLink;

    private LocalDateTime postCreatedTimeStamp;

    @ManyToOne
    private User postUser;
}
