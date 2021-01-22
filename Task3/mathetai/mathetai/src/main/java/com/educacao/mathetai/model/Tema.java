package com.educacao.mathetai.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table (name = "tb_tema")
public class Tema {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 50)
	private String assunto;
	
	@NotNull
	@Size(min = 5, max = 2550)
	private String keywords;
	
	@NotNull
	private int quantidade;
	
	/*
	 * @OneToMany(mappedBy = "tema_id", cascade = CascadeType.ALL)
	 * 
	 * @JsonIgnoreProperties("tema_id") private List<Postagem> postagem;
	 */

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	/*
	 * public List<Postagem> getPostagem() { return postagem; }
	 * 
	 * public void setPostagem(List<Postagem> postagem) { this.postagem = postagem;
	 * }
	 */
	
}
