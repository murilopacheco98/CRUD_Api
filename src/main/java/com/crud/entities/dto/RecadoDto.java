package com.crud.entities.dto;

public class RecadoDto {
  private String assunto;
  private String descricao;
  private Boolean arquivado;

  public RecadoDto() {
  }

  public RecadoDto(String assunto, String descricao, Boolean arquivado) {
    this.assunto = assunto;
    this.descricao = descricao;
    this.arquivado = arquivado;
  }

  public Boolean getArquivado() {
    return arquivado;
  }

  public void setArquivado(Boolean arquivado) {
    this.arquivado = arquivado;
  }

  public String getAssunto() {
    return assunto;
  }

  public void setAssunto(String assunto) {
    this.assunto = assunto;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }
}
