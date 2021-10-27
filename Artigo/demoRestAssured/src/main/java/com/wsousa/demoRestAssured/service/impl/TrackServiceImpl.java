package com.wsousa.demoRestAssured.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.domain.Track;
import com.wsousa.demoRestAssured.domain.Users;
import com.wsousa.demoRestAssured.repository.StrategyRepository;
import com.wsousa.demoRestAssured.repository.TrackRepository;
import com.wsousa.demoRestAssured.repository.UsersRepository;
import com.wsousa.demoRestAssured.service.StrategyService;
import com.wsousa.demoRestAssured.service.TrackService;
import com.wsousa.demoRestAssured.service.UsersService;
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
public class TrackServiceImpl implements TrackService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private TrackRepository trackRepository;

	@Autowired
	private StrategyService strategyService;


	public void buscarJson() {
		String path = "src/main/resources/";
		String filePath = "Track.json";



		try (Reader reader = new FileReader(new File(path+filePath))) {
			Gson gson = new Gson();

			// Convert JSON File to Java Object
			List<Track> list = gson.fromJson(reader, new TypeToken<List<Track>>() {}.getType());

			for(Track track: list) {
				LOG.info("track :  "+track.toString());
				Strategy strategy = strategyService.getDinId(track.getStrategyTracksId());
				track.setIdStrategy(Objects.isNull(strategy.getId()) ? 0L : strategy.getId());
				trackRepository.save(track);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	@Override
	public Track getDynId(String questionTracksTrackId) {
		return trackRepository.findByDyn(questionTracksTrackId);
	}


}
