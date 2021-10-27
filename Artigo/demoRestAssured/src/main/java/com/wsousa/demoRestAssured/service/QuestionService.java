package com.wsousa.demoRestAssured.service;

import com.wsousa.demoRestAssured.domain.Question;

public interface QuestionService {

	void buscarJson();

    Question getDynId(String questionTracksQuestionId);
}
