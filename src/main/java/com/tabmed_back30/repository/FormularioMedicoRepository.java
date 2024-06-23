package com.tabmed_back30.repository;

import com.tabmed_back30.model.FormularioMedico;
import com.tabmed_back30.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormularioMedicoRepository extends JpaRepository<FormularioMedico, Long> {
    List<FormularioMedico> findByMedico(Usuario medico);
}
