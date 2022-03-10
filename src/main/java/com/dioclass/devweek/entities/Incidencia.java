package com.dioclass.devweek.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_incidencia")
public class Incidencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer regiao_id;
	private Integer mes;
	private Long faixa_id;
	private Integer quantidade_exames;

	public Incidencia() {
	}

	public Incidencia(Integer regiao_id, Integer mes, Long faixa_id, Integer quantidade_exames) {
		this.regiao_id = regiao_id;
		this.mes = mes;
		this.faixa_id = faixa_id;
		this.quantidade_exames = quantidade_exames;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getRegiao_id() {
		return regiao_id;
	}

	public void setRegiao_id(Integer regiao_id) {
		this.regiao_id = regiao_id;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Long getFaixa_id() {
		return faixa_id;
	}

	public void setFaixa_id(Long faixa_id) {
		this.faixa_id = faixa_id;
	}

	public Integer getQuantidade_exames() {
		return quantidade_exames;
	}

	public void setQuantidade_exames(Integer quantidade_exames) {
		this.quantidade_exames = quantidade_exames;
	}
	
}
