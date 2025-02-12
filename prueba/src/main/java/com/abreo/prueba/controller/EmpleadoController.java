package com.abreo.prueba.controller;

import com.abreo.prueba.model.EmpleadoModel;
import com.abreo.prueba.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/empleado")
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping
    public ArrayList<EmpleadoModel> getAllEmpleado(){
        return empleadoService.getAllEmpleado();
    }

    @GetMapping(path="/{id}")
    public Optional<EmpleadoModel> getByIdEmpleado(@PathVariable ("id") Long id) {
        return this.empleadoService.getByIdEmpleado(id);
    }

    @PostMapping()
    public EmpleadoModel putEmpleado(@RequestBody EmpleadoModel empleado){
        return this.empleadoService.putEmpleado(empleado);
    }




}
