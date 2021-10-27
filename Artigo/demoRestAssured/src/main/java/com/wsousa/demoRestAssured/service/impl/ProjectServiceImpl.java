package com.wsousa.demoRestAssured.service.impl;

import java.util.List;
import java.util.Optional;

import com.wsousa.demoRestAssured.domain.Project;
import com.wsousa.demoRestAssured.repository.ProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.wsousa.demoRestAssured.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private ProjectRepository projectRespository;

	@Override
	public List<Project> listarTodos() {
		LOG.debug("This is a debug message");
		LOG.info("This is an info message");
		LOG.warn("This is a warn message");
		LOG.error("This is an error message");
		return this.projectRespository.findAll();
	}

	@Override
	public Project listarPorId(Long id) {
		return this.projectRespository.getOne(id);
	}

	@Override
	public Project cadastrar(Project Project) {
		return this.projectRespository.save(Project);
	}

	@Override
	public Project atualizar(Project Project) {
		return this.projectRespository.save(Project);
	}

	@Override
	public void remover(Long id) {
		Project proj = new Project();
		proj.setId(id);
		this.projectRespository.delete(proj);
	}

	@Override
	public List<Project> findByIDAsc() {
		LOG.info("buscar todos findByIDAsc");
		return this.projectRespository.findByIDAsc();
	}

	@Override
	public List<Project> findByPredicate() {
		return null;
	}

	@Override
	public List<Project> listarPorManyToOne() {
		return projectRespository.findByIDAsc();
	}

	@Override
	public List<Project> listProjectPorManyToOneNativeQuery() {
		LOG.info("EXECUTE NATIVE QUERY");
		return projectRespository.listProjectPorManyToOneNativeQuery();
	}

	@Override
	public List<Project> listProjectPorManyToOneNativeQuery(Long id) {
		LOG.info("EXECUTE NATIVE QUERY FOR ID");
		return projectRespository.listProjectPorManyToOneNativeQueryForId(id);
	}

	@Override
	public List<Project> listProjectPorManyToOneNativeQueryForIdParam(Long id) {
		LOG.info("EXECUTE NATIVE QUERY FOR ID FOR PARAM");
		return projectRespository.listProjectPorManyToOneNativeQueryForIdParam(id);
	}

	@Override
	public Optional<Project> readByClientName(String nome) {
		LOG.info("EXECUTE NATIVE QUERY FOR ID FOR PARAM " +nome.toUpperCase());
		return projectRespository.readByClientName(nome);
	}


}
