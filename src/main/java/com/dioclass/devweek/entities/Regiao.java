package com.dioclass.devweek.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_regiao")
public class Regiao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String regiao;
	private Long totalExame;

	public Regiao() {
	}

	public Regiao(String regiao, Long totalExame) {
		this.regiao = regiao;
		this.totalExame = totalExame;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public Long getTotalExame() {
		return totalExame;
	}

	public void setTotalExame(Long totalExame) {
		this.totalExame = totalExame;
	}
	
}
