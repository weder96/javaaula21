package com.wsousa.demoRestAssured.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wsousa.demoRestAssured.domain.Answers;
import com.wsousa.demoRestAssured.domain.Question;
import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.repository.QuestionRepository;
import com.wsousa.demoRestAssured.repository.StrategyRepository;
import com.wsousa.demoRestAssured.service.QuestionService;
import com.wsousa.demoRestAssured.service.StrategyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private QuestionRepository questionRepository;


	public void buscarJson() {
		String path = "src/main/resources/";
		String filePath = "Question.json";



		try (Reader reader = new FileReader(new File(path+filePath))) {
			Gson gson = new Gson();

			// Convert JSON File to Java Object
			List<Question> list = gson.fromJson(reader, new TypeToken<List<Question>>() {}.getType());
			// list.forEach(x -> System.out.println(x));

			for(Question question: list) {
				// LOG.info("question: "+question.toString());
				question.setAnswer(question.getAnswers() == null ? "" : question.getAnswers().toString());
				question.setExplanation(question.getExplanation() == null ? "" : question.getExplanation());
				for(Answers answers : question.getAnswers()){
					answers.setQuestion(question);
					// LOG.info("answers: "+answers.toString());
				}
			}

			questionRepository.saveAll(list);

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	@Override
	public Question getDynId(String questionTracksQuestionId) {
		return questionRepository.findDynId(questionTracksQuestionId);
	}


}
