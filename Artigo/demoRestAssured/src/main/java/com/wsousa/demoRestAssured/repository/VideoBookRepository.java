package com.wsousa.demoRestAssured.repository;

import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.domain.VideoBook;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface VideoBookRepository extends JpaRepository<VideoBook, Long> {


}
