package com.wsousa.demoRestAssured.service;

import java.util.List;
import java.util.Optional;

import com.wsousa.demoRestAssured.domain.Project;

public interface ProjectService {

	List<Project> listarTodos();


	List<Project> findByIDAsc();

	List<Project> findByPredicate();

	Project listarPorId(Long id);

	Project cadastrar(Project Project);

	Project atualizar(Project Project);

	void remover(Long id);

	List<Project> listarPorManyToOne();

	List<Project> listProjectPorManyToOneNativeQuery();

	List<Project> listProjectPorManyToOneNativeQuery(Long id);

	List<Project> listProjectPorManyToOneNativeQueryForIdParam(Long id);

	Optional<Project> readByClientName(String nome);

}
