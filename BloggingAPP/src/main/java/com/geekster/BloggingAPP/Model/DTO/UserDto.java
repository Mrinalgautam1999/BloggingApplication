package com.geekster.BloggingAPP.Model.DTO;

import com.geekster.BloggingAPP.Model.Comment;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private String userEmail;
    private String tokenValue;

    private Comment comment;
}
