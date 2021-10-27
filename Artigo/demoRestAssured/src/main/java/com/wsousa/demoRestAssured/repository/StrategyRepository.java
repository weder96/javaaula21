package com.wsousa.demoRestAssured.repository;

import com.wsousa.demoRestAssured.domain.Project;
import com.wsousa.demoRestAssured.domain.Strategy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public interface StrategyRepository extends JpaRepository<Strategy, Long> {

    @Query("SELECT s FROM Strategy s WHERE s.dyn = ?1")
    Strategy getDinId(String strategyTracksId);
}
