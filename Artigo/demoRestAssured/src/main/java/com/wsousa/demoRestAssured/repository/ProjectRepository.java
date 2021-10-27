package com.wsousa.demoRestAssured.repository;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import com.wsousa.demoRestAssured.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

@Transactional
public interface ProjectRepository extends JpaRepository<Project, Long> {


	@Transactional
	@Query("SELECT c FROM Project c order by c.id desc")
	public List<Project> findByIDAsc();

	@Query(value="SELECT c.* FROM project c order by c.id desc", nativeQuery = true)
	public List<Project> listProjectPorManyToOneNativeQuery();


	@Query(value="SELECT c.* FROM project c where c.id=?1", nativeQuery = true)
	public List<Project> listProjectPorManyToOneNativeQueryForId(Long id);


	@Query(value="SELECT c.* FROM project c where c.id=:id", nativeQuery = true)
	public List<Project> listProjectPorManyToOneNativeQueryForIdParam(@Param("id") Long id);

	@Query(value="SELECT c.* FROM project c where c.nome=:nome", nativeQuery = true)
	public Optional<Project> readByClientName(@Param("nome") String nome);


}
