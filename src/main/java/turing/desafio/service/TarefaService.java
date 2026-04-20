package turing.desafio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import turing.desafio.model.Tarefa;
import turing.desafio.model.dto.RequestTarefaDTO;
import turing.desafio.model.dto.ResponseTarefaDTO;
import turing.desafio.repository.TarefaRepository;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    private TarefaRepository repository;

    public Tarefa cadastrarTarefa(RequestTarefaDTO dto) {
        Tarefa tarefa = new Tarefa();
        tarefa.setTitulo(dto.titulo());
        tarefa.setDescricao(dto.descricao());
        tarefa.setConcluido(dto.concluido());
        tarefa.setData(dto.data());

        repository.save(tarefa);
        return tarefa;
    }

    public List<ResponseTarefaDTO> listarTarefas() {
        List<Tarefa> listar = repository.findAll();
        return listar.stream()
                .map(tarefa -> new ResponseTarefaDTO(tarefa.getId(),
                        tarefa.getTitulo(),
                        tarefa.getDescricao(),
                        tarefa.isConcluido(),
                        tarefa.getData()))
                .toList();
    }

    public Tarefa atualizarStatusTarefa(Long id) {
        Tarefa tarefa = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada, id inválido!"));

        tarefa.setConcluido(!tarefa.isConcluido());
        return repository.save(tarefa);
    }

    public Tarefa deletarTarefa(Long id) {
        Tarefa tarefa = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Tarefa não encontrada, id inválido!"));

        repository.delete(tarefa);
        return tarefa;
    }
}
