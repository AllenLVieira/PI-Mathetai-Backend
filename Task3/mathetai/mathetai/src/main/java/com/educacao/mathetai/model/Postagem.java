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
 * javax.validation.constraints.Size;
 * 
 * import org.hibernate.validator.constraints.Length;
 * 
 * import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 * 
 * @Entity
 * 
 * @Table (name = "tb_postagem") public class Postagem {
 * 
 * @Id
 * 
 * @GeneratedValue (strategy = GenerationType.IDENTITY) private long id;
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
 * @Size(min = 5, max = 15000) private String url_midia;
 * 
 * private int interacao;
 * 
 * @ManyToOne
 * 
 * @JsonIgnoreProperties("postagem") private Tema tema_id;
 * 
 * @ManyToOne
 * 
 * @JsonIgnoreProperties("postagem") private Usuario usuario_id;
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
 * public String getUrl_midia() { return url_midia; }
 * 
 * public void setUrl_midia(String url_midia) { this.url_midia = url_midia; }
 * 
 * public int getInteracao() { return interacao; }
 * 
 * public void setInteracao(int interacao) { this.interacao = interacao; }
 * 
 * public Tema getTema_id() { return tema_id; }
 * 
 * public void setTema_id(Tema tema_id) { this.tema_id = tema_id; }
 * 
 * public Usuario getUsuario_id() { return usuario_id; }
 * 
 * public void setUsuario_id(Usuario usuario_id) { this.usuario_id = usuario_id;
 * }
 * 
 * }
 */
