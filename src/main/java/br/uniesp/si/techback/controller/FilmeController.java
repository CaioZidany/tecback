package br.uniesp.si.techback.controller;

import java.util.List;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.service.FilmeService;
import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/filmes")
public class FilmeController {

    @Autowired
    private FilmeService filmeService;

    @PostMapping
    public Filme criarFilme(@RequestBody Filme filme) {
        return filmeService.salvar(filme);
    }

    @GetMapping
    public List<Filme> listarFilmes() {
        return filmeService.listarTodos();
    }

    @GetMapping("/{id}")
    public Filme buscarFilme(@PathVariable Long id) {
        return filmeService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Filme atualizarFilme(@PathVariable Long id, @RequestBody Filme filme) {
        return filmeService.atualizar(id, filme);
    }

    @DeleteMapping("/{id}")
    public void deletarFilme(@PathVariable Long id) {
        filmeService.deletar(id);
    }
}

