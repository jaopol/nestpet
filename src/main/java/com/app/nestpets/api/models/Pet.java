package com.app.nestpets.api.models;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import com.app.nestpets.api.enums.Porte;

import lombok.Data;

@Data
@Document(collection = "pet")
public class Pet implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	
	private String nome;
	
	private String nomePai;
	
	private String nomeMae;
	
	private String raca;
	
	private String pelagem;
	
	private String cor;
	
	private String sexo;
	
	private String foto;
	
	private Porte porte;
	
	private Date dataNascimentoPet;
	
	private Date dataNascimentoMae;
	
	private Date dataNascimentoPai;
	
	private String observacao;
	
	private String cuidados;
	
	private String pedigree;

	private String numeroIdentidade;
	
//	//@CreatedBy
//	private String user;

	@CreatedDate
	private Instant dataCriacao;

	//@LastModifiedBy
	//private String lastModifiedUser;

	@LastModifiedDate
	private Instant dataAtualizacao;

	
	public Pet() {
		
	}

	
	public Pet(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	
	public Pet(String id, String nome, String nomePai, String nomeMae, String raca, String pelagem,
			String cor, String sexo, String foto, String porte, Date dataNascimento, Date dataNascimentoPai, Date dataNascimentoMae,
			String observacao, String cuidados, String pedigree, String numeroIdentidade, Instant dataCriacao, Instant dataAtualizacao) {
		this.id = id;
		this.nome = nome;
		this.nomePai = nomePai;
		this.nomeMae = nomeMae;
		this.raca = raca;
		this.pelagem = pelagem;
		this.cor = cor;
		this.sexo = sexo;
		this.foto = foto;
		this.dataNascimentoPet = dataNascimento;
		this.dataNascimentoPai = dataNascimentoPai;
		this.dataNascimentoMae = dataNascimentoMae;
		this.observacao = observacao;
		this.cuidados = cuidados;
		this.pedigree = pedigree;
		this.porte = Porte.valueOf(porte);
		this.numeroIdentidade = numeroIdentidade;
		this.dataCriacao = dataCriacao;
		this.dataAtualizacao = dataAtualizacao;
	}

	
	
}
