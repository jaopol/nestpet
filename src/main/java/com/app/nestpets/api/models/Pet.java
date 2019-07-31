package com.app.nestpets.api.models;

import java.util.Date;

import com.app.nestpets.api.enums.Porte;

public class Pet {

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
	
	
	public Pet(String id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public Porte getPorte() {
		return porte;
	}
	public void setPorte(Porte porte) {
		this.porte = porte;
	}
	public Date getDataNascimentoPet() {
		return dataNascimentoPet;
	}
	public void setDataNascimentoPet(Date dataNascimentoPet) {
		this.dataNascimentoPet = dataNascimentoPet;
	}
	public Date getDataNascimentoMae() {
		return dataNascimentoMae;
	}
	public void setDataNascimentoMae(Date dataNascimentoMae) {
		this.dataNascimentoMae = dataNascimentoMae;
	}
	public Date getDataNascimentoPai() {
		return dataNascimentoPai;
	}
	public void setDataNascimentoPai(Date dataNascimentoPai) {
		this.dataNascimentoPai = dataNascimentoPai;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getCuidados() {
		return cuidados;
	}
	public void setCuidados(String cuidados) {
		this.cuidados = cuidados;
	}
	public String getPedigree() {
		return pedigree;
	}
	public void setPedigree(String pedigree) {
		this.pedigree = pedigree;
	}
	
	@Override
	public String toString() {
		return "Pet [nome=" + nome + "]";
	}
	
	
	
}
