package turing.desafio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import turing.desafio.model.Tarefa;
import turing.desafio.model.dto.RequestTarefaDTO;
import turing.desafio.model.dto.ResponseTarefaDTO;
import turing.desafio.model.dto.UpdateTarefaDTO;
import turing.desafio.service.TarefaService;

import java.util.List;

@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    @Autowired
    private TarefaService service;

    @PostMapping
    public ResponseEntity<Tarefa> cadastrarTarefa(@RequestBody RequestTarefaDTO dto) {
        Tarefa tarefa = service.cadastrarTarefa(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(tarefa);
    }

    @GetMapping
    public ResponseEntity<List<ResponseTarefaDTO>> listarTarefas() {
        List<ResponseTarefaDTO> list = service.listarTarefas();
        return ResponseEntity.ok(list);
    }

    @PutMapping("/{id}")
    public ResponseEntity atualizarStatus(@PathVariable Long id) {
        Tarefa tarefa = service.atualizarStatusTarefa(id);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity atualizarTarefa(@PathVariable Long id, @RequestBody UpdateTarefaDTO dto){
        Tarefa tarefa = service.atualizarTarefa(id, dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarTarefa(@PathVariable Long id){
        Tarefa tarefa = service.deletarTarefa(id);
        return ResponseEntity.ok(tarefa);
    }
}
