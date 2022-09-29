package com.kuniwake.vtraker.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// Lombok para abstrair get set construtores
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Source {
    private Object id;
    private String name;
}
