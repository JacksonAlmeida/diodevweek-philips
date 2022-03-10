package com.dioclass.devweek.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_faixa_etaria")
public class FaixaEtaria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long faixa_i;
	private Long faixa_n;
	private String descricao;
	
	public FaixaEtaria() {
	}

	public FaixaEtaria(Long faixa_i, Long faixa_n, String descricao) {
		this.faixa_i = faixa_i;
		this.faixa_n = faixa_n;
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFaixa_i() {
		return faixa_i;
	}

	public void setFaixa_i(Long faixa_i) {
		this.faixa_i = faixa_i;
	}

	public Long getFaixa_n() {
		return faixa_n;
	}

	public void setFaixa_n(Long faixa_n) {
		this.faixa_n = faixa_n;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
