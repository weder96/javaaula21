package com.wsousa.demoRestAssured.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wsousa.demoRestAssured.domain.Answers;
import com.wsousa.demoRestAssured.domain.Paragraph;
import com.wsousa.demoRestAssured.domain.Strategy;
import com.wsousa.demoRestAssured.domain.VideoBook;
import com.wsousa.demoRestAssured.repository.StrategyRepository;
import com.wsousa.demoRestAssured.repository.VideoBookRepository;
import com.wsousa.demoRestAssured.service.StrategyService;
import com.wsousa.demoRestAssured.service.VideoBookService;
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
public class VideoBookServiceImpl implements VideoBookService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private VideoBookRepository videoBookRepository;


	public void buscarJson() {
		String path = "src/main/resources/";
		String filePath = "Videobook.json";



		try (Reader reader = new FileReader(new File(path+filePath))) {
			Gson gson = new Gson();

			// Convert JSON File to Java Object
			List<VideoBook> list = gson.fromJson(reader, new TypeToken<List<VideoBook>>() {}.getType());
			// list.forEach(x -> System.out.println(x));

			for(VideoBook book: list) {
				LOG.info("VideoBook: "+book.toString());
				LOG.info("text: : "+book.getText());
				book.setParagraph(book.getText() == null ? " " : book.getText().toString());
				if(book.getText() != null)
				for(Paragraph param : book.getText()){
					param.setVideoBook(book);
					// LOG.info("answers: "+answers.toString());
				}
				videoBookRepository.save(book);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}




}
