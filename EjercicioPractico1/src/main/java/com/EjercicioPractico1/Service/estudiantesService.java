package com.EjercicioPractico1.Service;

import com.EjercicioPractico1.Domain.estudiantes;
import java.util.List;

public interface estudiantesService {
    
    public List <estudiantes> getestudiantes();
    
    // Se obtiene un Categoria, a partir del id de un categoria
    public estudiantes getestudiantes(estudiantes estudiantes);
    
    // Se inserta un nuevo categoria si el id del categoria esta vacío
    // Se actualiza un categoria si el id del categoria NO esta vacío
    public void save(estudiantes estudiantes);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete(estudiantes estudiantes);
}
