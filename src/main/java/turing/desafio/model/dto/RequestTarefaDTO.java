package turing.desafio.model.dto;

import java.time.LocalDate;

public record RequestTarefaDTO(String titulo, String descricao, boolean concluido, LocalDate data) {
}
