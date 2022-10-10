package com.crud.entities;

import java.util.Objects;

public class Recados {
  private Long id = 0L;
  private String assunto;
  private String descricao;

  public Recados() {

  }
  public Recados(Long id, String assunto, String descricao) {
    this.id = id;
    this.assunto = assunto;
    this.descricao = descricao;
  }

  public Recados(String assunto, String descricao) {
    this.assunto = assunto;
    this.descricao = descricao;
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

  @Override
  public String toString() {
    return "Recados{" +
            "id=" + id +
            ", assunto='" + assunto + '\'' +
            ", descricao='" + descricao + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Recados recados = (Recados) o;
    return Objects.equals(id, recados.id) && Objects.equals(assunto, recados.assunto) && Objects.equals(descricao, recados.descricao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, assunto, descricao);
  }

}