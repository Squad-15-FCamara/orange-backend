// Objeto que gera a forma que será respondido as exceptions que forem tratadas
package com.orange_evolution_backend.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ValidationError {
    private final String field;
    private final String message;
    
}
