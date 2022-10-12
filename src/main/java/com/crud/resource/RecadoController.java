package com.crud.resource;

import com.crud.entities.Recados;
import com.crud.entities.dto.RecadoDto;
import com.crud.service.RecadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class RecadoController {

    @Autowired
    private RecadoService service;

    @GetMapping()
    public ResponseEntity<List<Recados>> read() {
        List<Recados> listUser = service.findAll();
        return ResponseEntity.ok(listUser);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Recados> findid(@PathVariable("id") Long id) {
        Recados recado = service.findById(id);
        return ResponseEntity.ok(recado);
    }

    @GetMapping("/")
    public ResponseEntity<List<Recados>> search(@RequestParam("search") String search, @RequestParam("status") String status) {
      List<Recados> recado = service.consulta(search, status);
      return ResponseEntity.ok(recado);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable("id") Long id, @RequestBody Recados recado) {
        service.update(id, recado);
        return "Atualizado com sucesso";
    }

    @PostMapping
    public ResponseEntity<Recados> create(@RequestBody RecadoDto recadoDto) {
        Recados recado = service.save(recadoDto);
        return ResponseEntity.ok(recado);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        if (service.remove(id)) {
            return "Apagado com sucesso";
        }
        return "Usuário não encontrado";
    }
}
