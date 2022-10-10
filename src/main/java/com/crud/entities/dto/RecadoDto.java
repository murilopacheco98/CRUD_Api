package com.crud.entities.dto;

import java.util.Objects;

public class RecadoDto {
  private String assunto;
  private String descricao;
  private Boolean arquivado;
  private String status;

  public RecadoDto() {
  }

  public RecadoDto(String assunto, String descricao, Boolean arquivado, String status) {
    this.assunto = assunto;
    this.descricao = descricao;
    this.arquivado = arquivado;
    this.status = status;
  }

  @Override
  public String toString() {
    return "RecadoDto{" +
            "assunto='" + assunto + '\'' +
            ", descricao='" + descricao + '\'' +
            ", arquivado=" + arquivado +
            ", status='" + status + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    RecadoDto recadoDto = (RecadoDto) o;
    return Objects.equals(assunto, recadoDto.assunto) && Objects.equals(descricao, recadoDto.descricao) && Objects.equals(arquivado, recadoDto.arquivado) && Objects.equals(status, recadoDto.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assunto, descricao, arquivado, status);
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

  public Boolean getArquivado() {
    return arquivado;
  }

  public void setArquivado(Boolean arquivado) {
    this.arquivado = arquivado;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
