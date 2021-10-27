package com.wsousa.demoRestAssured.service.impl;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.List;
import java.util.Objects;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wsousa.demoRestAssured.domain.FlyTrack;
import com.wsousa.demoRestAssured.domain.Question;
import com.wsousa.demoRestAssured.domain.QuestionResponse;
import com.wsousa.demoRestAssured.domain.Track;
import com.wsousa.demoRestAssured.domain.Users;
import com.wsousa.demoRestAssured.repository.FlyTrackRepository;
import com.wsousa.demoRestAssured.service.FlyTrackService;
import com.wsousa.demoRestAssured.service.QuestionService;
import com.wsousa.demoRestAssured.service.TrackService;
import com.wsousa.demoRestAssured.service.UsersService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlyTrackServiceImpl implements FlyTrackService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private FlyTrackRepository flyTrackRepository;

	@Autowired
	private QuestionService questionService;

	@Autowired
	private UsersService usersService;

	@Autowired
	private TrackService trackService;

	public void buscarJson() {
		String path = "src/main/resources/";
		String filePath = "FlyTrack.json";



		try (Reader reader = new FileReader(new File(path+filePath))) {
			Gson gson = new Gson();

			// Convert JSON File to Java Object
			List<FlyTrack> list = gson.fromJson(reader, new TypeToken<List<FlyTrack>>() {}.getType());

			for(FlyTrack flyTrack: list) {
				LOG.info("flyTrack :  "+flyTrack.toString());

				Track track = trackService.getDynId(flyTrack.getFlyTrackTrackId());
				flyTrack.setTrackId(Objects.isNull(track.getIdTrack()) ? 0L : track.getIdTrack());

				Users user = usersService.getDynId(flyTrack.getOwner());
				if(user != null)
				flyTrack.setUserId(Objects.isNull(user.getId()) ? 0L : user.getId());

				if(flyTrack.getAnswers() != null)
				for(QuestionResponse response: flyTrack.getAnswers()){
					response.setFlyTrack(flyTrack);
					Question question = questionService.getDynId(response.getQuestion());

					if(question != null)
						response.setQuestionId(question.getIdQuestion());
				}

				flyTrackRepository.save(flyTrack);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}




}
