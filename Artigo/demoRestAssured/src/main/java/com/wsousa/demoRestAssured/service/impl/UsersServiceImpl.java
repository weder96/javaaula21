package com.wsousa.demoRestAssured.service.impl;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.wsousa.demoRestAssured.domain.Users;
import com.wsousa.demoRestAssured.repository.UsersRepository;
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

@Service
public class UsersServiceImpl implements UsersService {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());


	@Autowired
	private UsersRepository usersRepository;


	public void buscarJson() {
		String path = "src/main/resources/";
		String filePath = "Users.json";



		try (Reader reader = new FileReader(new File(path+filePath))) {
			Gson gson = new Gson();

			// Convert JSON File to Java Object
			List<Users> list = gson.fromJson(reader, new TypeToken<List<Users>>() {}.getType());
			// list.forEach(x -> System.out.println(x));

			for(Users user: list) {
				LOG.info("users: : "+user.toString());
				usersRepository.save(user);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	@Override
	public Users getDynId(String owner) {
		return usersRepository.getDynId(owner);
	}

}
