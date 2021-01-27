/*
 * package com.educacao.mathetai.model;
 * 
 * import java.util.Date;
 * 
 * import javax.persistence.Entity; import javax.persistence.GeneratedValue;
 * import javax.persistence.GenerationType; import javax.persistence.Id; import
 * javax.persistence.ManyToOne; import javax.persistence.Table; import
 * javax.persistence.Temporal; import javax.persistence.TemporalType; import
 * javax.validation.constraints.NotNull; import
 * javax.validation.constraints.Size; import
 * com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 * 
 * @Entity
 * 
 * @Table(name = "tb_postagem") public class Postagem {
 * 
 * @Id
 * 
 * @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
 * 
 * @NotNull
 * 
 * @Size(min = 5, max = 2000) private String descricao;
 * 
 * @Temporal(TemporalType.TIMESTAMP) private Date data = new
 * java.sql.Date(System.currentTimeMillis());
 * 
 * @NotNull
 * 
 * @Size(min = 5, max = 10000) private String link;
 * 
 * private int interacao;
 * 
 * private String tag;
 * 
 * @ManyToOne
 * 
 * @JsonIgnoreProperties("postagem") private Tema tema;
 * 
 * @ManyToOne
 * 
 * @JsonIgnoreProperties("postagem") private Usuario usuario;
 * 
 * public long getId() { return id; }
 * 
 * public void setId(long id) { this.id = id; }
 * 
 * public String getDescricao() { return descricao; }
 * 
 * public void setDescricao(String descricao) { this.descricao = descricao; }
 * 
 * public Date getData() { return data; }
 * 
 * public void setData(Date data) { this.data = data; }
 * 
 * public String getLink() { return link; }
 * 
 * public void setLink(String link) { this.link = link; }
 * 
 * public int getInteracao() { return interacao; }
 * 
 * public void setInteracao(int interacao) { this.interacao = interacao; }
 * 
 * public String getTag() { return tag; }
 * 
 * public void setTag(String tag) { this.tag = tag; }
 * 
 * public Tema getTema() { return tema; }
 * 
 * public void setTema(Tema tema) { this.tema = tema; }
 * 
 * public Usuario getUsuario() { return usuario; }
 * 
 * public void setUsuario(Usuario usuario) { this.usuario = usuario; }
 * 
 * }
 */