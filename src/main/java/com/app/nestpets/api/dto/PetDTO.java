package com.app.nestpets.api.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Date;

import com.app.nestpets.api.models.Pet;

import lombok.Data;

@Data
public class PetDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String nome;
	private String nomePai;
	private String nomeMae;
	private String raca;
	private String pelagem;
	private String cor;
	private String sexo;
	private String foto;
	private String porte;
	private Date dataNascimentoPet;
	private Date dataNascimentoMae;
	private Date dataNascimentoPai;
	private String observacao;
	private String cuidados;
	private String pedigree;
	private String numeroIdentidade;
	private Instant dataCriacao;
	private Instant dataAtualizacao;
	
	public PetDTO() {
		
	}
	
	public PetDTO(Pet obj) {
		this.id = obj.getId();
		this.nome = obj.getNome();
		this.nomePai = obj.getNomePai();
		this.nomeMae = obj.getNomeMae();
		this.raca = obj.getRaca();
		this.pelagem = obj.getPelagem();
		this.cor = obj.getCor();
		this.sexo = obj.getSexo();
		this.foto = obj.getFoto();
		this.porte = obj.getPorte().getValue();
		this.dataNascimentoPet = obj.getDataNascimentoPet();
		this.dataNascimentoPai = obj.getDataNascimentoPai();
		this.dataNascimentoMae = obj.getDataNascimentoMae();
		this.observacao = obj.getObservacao();
		this.cuidados = obj.getCuidados();
		this.pedigree = obj.getPedigree();
		this.numeroIdentidade = obj.getNumeroIdentidade();
		this.dataCriacao = obj.getDataCriacao();
		this.dataAtualizacao = obj.getDataAtualizacao();
	}
	

}
