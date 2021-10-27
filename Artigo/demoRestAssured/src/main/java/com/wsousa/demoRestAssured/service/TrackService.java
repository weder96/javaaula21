package com.wsousa.demoRestAssured.service;

import com.wsousa.demoRestAssured.domain.Track;

public interface TrackService {

	void buscarJson();

    Track getDynId(String questionTracksTrackId);
}
