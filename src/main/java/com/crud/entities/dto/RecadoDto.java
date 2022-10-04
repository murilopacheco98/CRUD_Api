package com.crud.entities.dto;

public class RecadoDto {
  private Long id;
  private String nome;
  private Long idRoles;

  public RecadoDto(Long id, String nome, Long idRoles) {
    this.id = id;
    this.nome = nome;
    this.idRoles = idRoles;
  }

//  public RecadoDto(User user, Set<Roles> roles){
//    this.id = user.getId();
//    this.nome = user.getNome();
//  }

  public RecadoDto() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Long getIdRoles() {
    return idRoles;
  }

  public void setIdRoles(Long idRoles) {
    this.idRoles = idRoles;
  }
}
