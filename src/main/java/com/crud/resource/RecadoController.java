package com.crud.resource;

import com.crud.entities.Recados;
import com.crud.entities.dto.RecadoDto;
import com.crud.service.RecadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recados")
@CrossOrigin()
public class RecadoController {

  @Autowired
  private RecadoService service;

  @GetMapping()
  public ResponseEntity<List<Recados>> read(){
    List<Recados> listUser = service.findAll();
    return ResponseEntity.ok(listUser);
  }

  @GetMapping("/{id}")
  public ResponseEntity<Recados> findid(@PathVariable("id") Long id) {
    Recados recado = service.findById(id);
    return ResponseEntity.ok(recado);
  }

  @PutMapping("/{id}")
  public String update(@PathVariable("id") Long id, @RequestBody Recados recado){
    service.update(id, recado);
    return "Atualizado com sucesso";
  }

  @PostMapping
  public String create(@RequestBody RecadoDto recadoDto){
    service.save(recadoDto);
    return "salvo com sucesso";
  }

  @DeleteMapping("/{id}")
  public String deleteById(@PathVariable("id") Long id){
    if(service.remove(id)) {
      return "Apagado com sucesso";
    }
    return "Usuário não encontrado";
  }
}
