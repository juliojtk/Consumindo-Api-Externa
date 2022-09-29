package com.kuniwake.vtraker.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

// Lombok para abstrair get set construtores
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {
    private Source source;
    private String author;
    private String title;
    private String description;
    private String url;
    private String urlToImage;
    private Date publishedAt;
    private String content;

}
