package br.uniesp.si.techback.service.impl;

import java.util.List;

import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.repository.FilmeRepository;
import br.uniesp.si.techback.service.FilmeService;
import br.uniesp.si.techback.model.Filme;
import br.uniesp.si.techback.repository.FilmeRepository;
import br.uniesp.si.techback.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
    public class FilmeServiceImpl implements FilmeService {

        @Autowired
        private FilmeRepository filmeRepository;

        @Override
        public Filme salvar(Filme filme) {
            return filmeRepository.save(filme);
        }

        @Override
        public List<Filme> listarTodos() {
            return filmeRepository.findAll();
        }

        @Override
        public Filme buscarPorId(Long id) {
            return filmeRepository.findById(id).orElse(null);
        }

        @Override
        public Filme atualizar(Long id, Filme filme) {
            if (filmeRepository.existsById(id)) {
                return filmeRepository.save(filme);
            }
            return null;
        }

        @Override
        public void deletar(Long id) {
            filmeRepository.deleteById(id);
        }
    }
