package com.wsousa.demoRestAssured.repository;

import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface UsersRepository extends JpaRepository<Users, Long> {

	@Query("SELECT u FROM Users u WHERE u.owner = ?1")
	Users getDynId(String owner);
}
