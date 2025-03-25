package br.uniesp.si.techback.service;

import java.util.List;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.model.Filme;

public interface FilmeService {
    Filme salvar(Filme filme);
    List<Filme> listarTodos();
    Filme buscarPorId(Long id);
    Filme atualizar(Long id, Filme filme);
    void deletar(Long id);
}