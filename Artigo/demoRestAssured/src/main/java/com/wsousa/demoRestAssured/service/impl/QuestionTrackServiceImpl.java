package com.wsousa.demoRestAssured.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wsousa.demoRestAssured.domain.Question;
import com.wsousa.demoRestAssured.domain.QuestionTrack;
import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.domain.Track;
import com.wsousa.demoRestAssured.repository.QuestionTrackRepository;
import com.wsousa.demoRestAssured.repository.TrackRepository;
import com.wsousa.demoRestAssured.service.QuestionService;
import com.wsousa.demoRestAssured.service.StrategyService;
import com.wsousa.demoRestAssured.service.QuestionTrackService;
import com.wsousa.demoRestAssured.service.TrackService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Objects;

@Service
public class QuestionTrackServiceImpl implements QuestionTrackService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private QuestionTrackRepository questionTrackRepository;

	@Autowired
	private TrackService trackService;

	@Autowired
	private QuestionService questionService;

	public void buscarJson() {
		String path = "src/main/resources/";
		String filePath = "QuestionTracks.json";



		try (Reader reader = new FileReader(new File(path+filePath))) {
			Gson gson = new Gson();

			// Convert JSON File to Java Object
			List<QuestionTrack> list = gson.fromJson(reader, new TypeToken<List<QuestionTrack>>() {}.getType());

			for(QuestionTrack questionTrack: list) {
				LOG.info("QuestionTrack :  "+questionTrack.toString());

				Track track = trackService.getDynId(questionTrack.getQuestionTracksTrackId());
				questionTrack.setTrackId(Objects.isNull(track.getIdTrack()) ? 0L : track.getIdTrack());

				Question question = questionService.getDynId(questionTrack.getQuestionTracksQuestionId().trim());

				if(question != null) {
					// LOG.info("question :  "+question.toString());
					questionTrack.setQuestionId(Objects.isNull(question.getIdQuestion()) ? 0L : question.getIdQuestion());
				}
				 questionTrackRepository.save(questionTrack);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}




}
