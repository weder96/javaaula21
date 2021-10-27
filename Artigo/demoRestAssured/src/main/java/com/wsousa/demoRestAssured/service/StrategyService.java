package com.wsousa.demoRestAssured.service;

import com.wsousa.demoRestAssured.domain.Project;
import com.wsousa.demoRestAssured.domain.Strategy;

import java.util.List;
import java.util.Optional;

public interface StrategyService {

	void buscarJson();

    Strategy getDinId(String strategyTracksId);
}
