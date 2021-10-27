package com.wsousa.demoRestAssured.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wsousa.demoRestAssured.domain.Project;
import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.repository.ProjectRepository;
import com.wsousa.demoRestAssured.repository.StrategyRepository;
import com.wsousa.demoRestAssured.service.ProjectService;
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
import java.util.Optional;

@Service
public class StrategyServiceImpl implements StrategyService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private StrategyRepository strategyRepository;


	public void buscarJson() {
		String path = "src/main/resources/";
		String filePath = "Strategy.json";



		try (Reader reader = new FileReader(new File(path+filePath))) {
			Gson gson = new Gson();

			// Convert JSON File to Java Object
			List<Strategy> list = gson.fromJson(reader, new TypeToken<List<Strategy>>() {}.getType());
			// list.forEach(x -> System.out.println(x));

			for(Strategy strategy: list) {
				LOG.info("Strategy: "+strategy.toString());
				strategyRepository.save(strategy);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	@Override
	public Strategy getDinId(String strategyTracksId) {
		return strategyRepository.getDinId(strategyTracksId);
	}


}
