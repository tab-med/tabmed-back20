package com.tabmed_back30.services;

import com.tabmed_back30.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tabmed_back30.repository.UsuarioRepository;

import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Optional<Usuario> buscarUsuarioPorCpfESenha(String cpf, String senha) {
        return usuarioRepository.findByCpfAndSenha(cpf, senha);
    }

    public Optional<Usuario> buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id);
    }
}
