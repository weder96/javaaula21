package com.wsousa.demoRestAssured.repository;

import com.wsousa.demoRestAssured.domain.Question;
import com.wsousa.demoRestAssured.domain.Strategy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface QuestionRepository extends JpaRepository<Question, Long> {

    @Query("SELECT q FROM Question q WHERE TRIM(q.id) LIKE ?1")
    Question findDynId(String questionTracksQuestionId);
}
