package br.uniesp.si.techback.repository;

import br.uniesp.si.techback.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import br.uniesp.si.techback.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
