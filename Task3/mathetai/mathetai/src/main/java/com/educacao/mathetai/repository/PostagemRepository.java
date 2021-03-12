package com.educacao.mathetai.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.educacao.mathetai.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTagContainingIgnoreCase(String tag);

	public List<Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);
	
	@Modifying @Transactional
	@Query(value = "UPDATE tb_postagem set interacao = interacao+1 where id = :idPostagem", nativeQuery = true)
	public void updateInteracao(@Param("idPostagem") long idPostagem);
}
