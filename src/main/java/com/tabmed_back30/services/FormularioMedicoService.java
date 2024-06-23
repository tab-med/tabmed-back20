package com.tabmed_back30.services;

import com.tabmed_back30.model.FormularioMedico;
import com.tabmed_back30.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tabmed_back30.repository.FormularioMedicoRepository;

import java.util.List;

@Service
public class FormularioMedicoService {
    @Autowired
    private FormularioMedicoRepository formularioMedicoRepository;

    public FormularioMedico salvarFormularioMedico(FormularioMedico formularioMedico) {
        return formularioMedicoRepository.save(formularioMedico);
    }

    public List<FormularioMedico> buscarFormulariosPorMedico(Usuario medico) {
        return formularioMedicoRepository.findByMedico(medico);
    }
}
