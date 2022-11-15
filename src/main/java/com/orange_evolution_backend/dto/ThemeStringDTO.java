// Este objeto serve para retornar os atributos das temas de forma que não tenha interação 
// com as relações( que retorne o nome de trilha) para que tenha somente as informações necessárias para o Front.

package com.orange_evolution_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThemeStringDTO {
    private Long id;
    private String name;
    private String nameRoad;
}
