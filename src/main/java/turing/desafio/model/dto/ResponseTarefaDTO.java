package turing.desafio.model.dto;

import java.time.LocalDate;

public record ResponseTarefaDTO(Long id, String titulo, String descricao, boolean concluido, LocalDate data) {
}
