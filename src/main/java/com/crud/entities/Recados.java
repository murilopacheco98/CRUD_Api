package com.crud.entities;

import java.util.Objects;

public class Recados {
  private Long id = 0L;
  private String assunto;
  private String descricao;
  private Boolean arquivado;
  private String status;

  public Recados() {
  }

  public Recados( String assunto, String descricao, Boolean arquivado, String status) {
    this.assunto = assunto;
    this.descricao = descricao;
    this.arquivado = arquivado;
    this.status = status;
  }

  public Recados(Long id, String assunto, String descricao, Boolean arquivado) {
    this.id = id;
    this.assunto = assunto;
    this.descricao = descricao;
    this.arquivado = arquivado;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "Recados{" +
            "id=" + id +
            ", assunto='" + assunto + '\'' +
            ", descricao='" + descricao + '\'' +
            ", arquivado=" + arquivado +
            ", status='" + status + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Recados recados = (Recados) o;
    return Objects.equals(id, recados.id) && Objects.equals(assunto, recados.assunto) && Objects.equals(descricao, recados.descricao) && Objects.equals(arquivado, recados.arquivado) && Objects.equals(status, recados.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assunto, descricao, arquivado, status);
  }
}