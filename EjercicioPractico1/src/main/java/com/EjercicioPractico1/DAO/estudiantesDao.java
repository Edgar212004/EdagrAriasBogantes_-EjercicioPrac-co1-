package com.EjercicioPractico1.DAO;

import com.EjercicioPractico1.Domain.estudiantes; 
import org.springframework.data.jpa.repository.JpaRepository;

public interface estudiantesDao extends JpaRepository<estudiantes, Long> {
    
}
