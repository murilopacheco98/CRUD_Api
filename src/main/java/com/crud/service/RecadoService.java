package com.crud.service;

import com.crud.entities.Recados;
import com.crud.entities.dto.RecadoDto;
import com.crud.exception.ExceptionNotFound;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class RecadoService {

  //SIMULANDO BANCO DE DADOS
  List<Recados> bdRecados = new ArrayList<>();

  public Recados save(RecadoDto recadoDto) {
    if(recadoDto.getAssunto() == null) {
      throw new ExceptionNotFound("Todos os campos devem estar preenchidos");
    }
    if(recadoDto.getDescricao() == null) {
      throw new ExceptionNotFound("Todos os campos devem estar preenchidos");
    }
    Recados recado = new Recados(recadoDto.getAssunto(), recadoDto.getDescricao(), recadoDto.getArquivado(), recadoDto.getStatus());
    if (bdRecados.size() != 0) {
      recado.setId(bdRecados.get(bdRecados.size() - 1).getId() + 1);
      bdRecados.add(recado);
      return recado;
    } else {
      recado.setId(1L);
      bdRecados.add(recado);
      return recado;
    }
  }

  public List<Recados> findAll() {
    return bdRecados;
  }

  public Recados findById(Long id) {
    for (Recados recado : bdRecados) {
      if (Objects.equals(recado.getId(), id)) {
         return recado;
      }
    }
    return null;
  }

  public void update(Long id, Recados recado) {
    for (Recados recados : bdRecados) {
      if (recados.getId().equals(id)) {
//        recados.setId(recado.getId());
        recados.setAssunto(recado.getAssunto());
        recados.setDescricao(recado.getDescricao());
        recados.setArquivado(recado.getArquivado());
        return;
      }
    }
  }

  public boolean remove(Long id) {
    for (Recados recados : bdRecados) {
      if(Objects.equals(recados.getId(), id)) {
        bdRecados.remove(recados);
        return true;
      }
    }
    return false;
  }

  public List<Recados> consulta(String search, String status) {
    List<Recados> bdRecadosConsultados = new ArrayList<>();
    search = search.trim();
    for (Recados recado : bdRecados) {
//      if (Objects.equals(search, null)) {
      if (search.length() < 1) {
        if (recado.getStatus().equals(status)){
          bdRecadosConsultados.add(recado);
        }
        if (Objects.equals(status, "todos")) {
          bdRecadosConsultados.add(recado);
        }
      }
      if (recado.getAssunto().matches("(.*)" + search + "(.*)")) {
        if (recado.getStatus().equals(status)){
          bdRecadosConsultados.add(recado);
        }
        if (Objects.equals(status, "todos")) {
          bdRecadosConsultados.add(recado);
        }
      }
    }
    return bdRecadosConsultados;
  }
}
