package com.educacao.mathetai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educacao.mathetai.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTagContainingIgnoreCase(String tag);

	public List<Postagem> findAllByDescricaoContainingIgnoreCase(String descricao);
}
