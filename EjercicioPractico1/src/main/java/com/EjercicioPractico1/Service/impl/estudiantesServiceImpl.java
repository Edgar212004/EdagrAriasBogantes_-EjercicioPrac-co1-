package com.EjercicioPractico1.Service.impl;

import com.EjercicioPractico1.DAO.estudiantesDao;
import com.EjercicioPractico1.Domain.estudiantes;
import com.EjercicioPractico1.Service.estudiantesService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class estudiantesServiceImpl implements estudiantesService{
    
    @Autowired
    private estudiantesDao estudiantesDao;
    @Override
    @Transactional(readOnly=true)
    public List<estudiantes> getestudiantes() {
        var lista=estudiantesDao.findAll();
        return lista;
    }
    @Override
    @Transactional(readOnly = true)
    public estudiantes getestudiantes(estudiantes estudiantes) {
        return estudiantesDao.findById(estudiantes.getId()).orElse(null);
    }
    @Override
    @Transactional
    public void save(estudiantes estudiantes) {
        estudiantesDao.save(estudiantes);
    }
    @Override
    @Transactional
    public void delete(estudiantes categoria) {
        estudiantesDao.delete(categoria);
    }
}
