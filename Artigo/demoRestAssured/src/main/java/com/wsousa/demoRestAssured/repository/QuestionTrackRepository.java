package com.wsousa.demoRestAssured.repository;

import com.wsousa.demoRestAssured.domain.QuestionTrack;
import com.wsousa.demoRestAssured.domain.Track;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface QuestionTrackRepository extends JpaRepository<QuestionTrack, Long> {


}
