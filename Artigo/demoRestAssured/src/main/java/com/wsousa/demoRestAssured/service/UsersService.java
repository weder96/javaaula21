package com.wsousa.demoRestAssured.service;

import com.wsousa.demoRestAssured.domain.Users;

public interface UsersService {

	void buscarJson();

	Users getDynId(String owner);
}
