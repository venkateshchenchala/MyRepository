package org.ass.ums.controller;

import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.ass.ums.service.impl.RegisterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterRestController 
{
	@Autowired
	private RegisterServiceImpl registerServiceImpl;

@GetMapping(value="/getAllUser")
public @ResponseBody List<RegisterEntity> getAllUser()
{
	return registerServiceImpl.getAllUser();
}
	@PostMapping(value="/saveUser")
public void saveUser(@RequestBody RegisterEntity registerEntity)
	{
		registerServiceImpl.processUserInfo(registerEntity);
	}	
}

