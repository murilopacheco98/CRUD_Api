package com.crud.entities.dto;

public class RecadoDto {
  private String assunto;
  private String descricao;

  public RecadoDto() {
  }

  public RecadoDto(String assunto, String descricao) {
    this.assunto = assunto;
    this.descricao = descricao;
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
