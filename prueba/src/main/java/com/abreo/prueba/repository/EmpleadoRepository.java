package com.abreo.prueba.repository;

import com.abreo.prueba.model.EmpleadoModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository  extends CrudRepository<EmpleadoModel, Long> {

}
