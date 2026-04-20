package turing.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import turing.desafio.model.Tarefa;

import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {

    Optional<Tarefa> findByTitulo(String titulo);
}
