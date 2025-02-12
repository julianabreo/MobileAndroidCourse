package com.abreo.prueba.service;

import com.abreo.prueba.model.EmpleadoModel;
import com.abreo.prueba.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpleadoService {
    @Autowired
    EmpleadoRepository empleadoRepository;

    public ArrayList<EmpleadoModel> getAllEmpleado(){
        return (ArrayList<EmpleadoModel>) empleadoRepository.findAll();
    }
    public Optional<EmpleadoModel>  getByIdEmpleado(Long id){
        return empleadoRepository.findById(id);
    }

    public EmpleadoModel putEmpleado(EmpleadoModel empleado) {
        return empleadoRepository.save(empleado);
    }

    public boolean deleteByIdEMpleado(Long id) {
        try{
            empleadoRepository.deleteById(id);
            return true;
        }catch (Exception err){
            return false;
        }
    }


}
