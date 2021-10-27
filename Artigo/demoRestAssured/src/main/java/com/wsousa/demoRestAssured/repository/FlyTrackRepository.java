package com.wsousa.demoRestAssured.repository;

import javax.transaction.Transactional;

import com.wsousa.demoRestAssured.domain.FlyTrack;
import com.wsousa.demoRestAssured.domain.QuestionTrack;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface FlyTrackRepository extends JpaRepository<FlyTrack, Long> {


}
