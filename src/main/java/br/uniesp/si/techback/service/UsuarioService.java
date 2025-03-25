package br.uniesp.si.techback.service;

import java.util.List;

import br.uniesp.si.techback.model.Usuario;
import br.uniesp.si.techback.model.Usuario;

public interface UsuarioService {
    Usuario salvar(Usuario usuario);
    List<Usuario> listarTodos();
    Usuario buscarPorId(Long id);
    Usuario atualizar(Long id, Usuario usuario);
    void deletar(Long id);
}
