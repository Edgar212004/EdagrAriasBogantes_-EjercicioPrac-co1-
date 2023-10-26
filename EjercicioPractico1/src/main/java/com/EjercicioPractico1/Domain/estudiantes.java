package com.EjercicioPractico1.Domain;
import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name="estudiantes")
public class estudiantes implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private long id;    
    private String nombre;
    private String identificacion;
    private String nivel_cursando;
    private int edad;
    private double altura;
    private double peso;
    private String genero;
    
    public estudiantes() {
    }
    

    public estudiantes(String nombre, String identificacion, String nivel_cursando, int edad, double altura, double peso, String genero) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.nivel_cursando = nivel_cursando;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.genero = genero;
    }
    
    
}
