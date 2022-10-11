package com.crud.service;

import com.crud.entities.Recados;
import com.crud.entities.dto.RecadoDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class RecadoService {

  //SIMULANDO BANCO DE DADOS
  List<Recados> bdRecados = new ArrayList<>();

  public Recados save(RecadoDto recadoDto) {
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
//        int posicao = Math.toIntExact(recados.getId());
//        for (Recados recados2 : bdRecados) {
//          if (Math.toIntExact(recados2.getId()) > posicao) {
//            recados2.setId(recados2.getId() - 1);
//          }
//        }
        return true;
      }
    }
    return false;
  }

  public List<Recados> consulta(String search, String status) {
    List<Recados> bdRecadosConsultados = new ArrayList<>();
    search = search.trim();
    for (Recados recado : bdRecados) {
      if (Objects.equals(search, "")) {
        if (recado.getStatus().equals(status)){
          bdRecadosConsultados.add(recado);
        }
      }
      if (recado.getAssunto().matches("(.*)" + search + "(.*)")) {
        if (recado.getStatus().equals(status)){
          bdRecadosConsultados.add(recado);
        } else {
          bdRecadosConsultados.add(recado);
        }
      }
    }
    return bdRecadosConsultados;
  }
}
