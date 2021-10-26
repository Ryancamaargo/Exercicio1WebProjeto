package br.edu.utfpr.webExercicio1.repository;

import br.edu.utfpr.webExercicio1.model.Receituario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceituarioRepository extends JpaRepository<Receituario, Long> {

}
