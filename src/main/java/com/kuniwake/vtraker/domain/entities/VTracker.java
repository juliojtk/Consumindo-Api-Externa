package com.kuniwake.vtraker.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

// Lombok para abstrair get set construtores
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class VTracker {
    private String status;
    private int totalResults;
    private ArrayList<Article> articles;
}
