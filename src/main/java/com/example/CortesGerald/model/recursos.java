package com.example.CortesGerald.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class recursos {
    private int id;
    private String nombre;
    private int disponibilidad;
    private String responsable;
    private int fechaDeCreacion;
    private String tipoDeRecurso;
    private int cantidadDelRecurso;
}
