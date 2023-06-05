package com.hg.apifiscal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class NFe {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String numero;
  private String dataEmissao;
  private String emitente;
  private String destinatario;

  public NFe() {
  }

  public NFe(String numero, String dataEmissao, String emitente, String destinatario) {
    this.numero = numero;
    this.dataEmissao = dataEmissao;
    this.emitente = emitente;
    this.destinatario = destinatario;
  }

  // Getters e Setters

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getDataEmissao() {
    return dataEmissao;
  }

  public void setDataEmissao(String dataEmissao) {
    this.dataEmissao = dataEmissao;
  }

  public String getEmitente() {
    return emitente;
  }

  public void setEmitente(String emitente) {
    this.emitente = emitente;
  }

  public String getDestinatario() {
    return destinatario;
  }

  public void setDestinatario(String destinatario) {
    this.destinatario = destinatario;
  }

}
