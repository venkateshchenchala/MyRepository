package org.ass.ums.service.impl;

import java.util.List;

import org.ass.ums.entity.RegisterEntity;
import org.ass.ums.repository.RegisterRepository;
import org.ass.ums.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;
@Service
public class RegisterServiceImpl implements RegisterService
 {
	@Autowired
private RegisterRepository registerRepository;

	@Override
	public void processUserInfo(RegisterEntity registerEntity) {
		
		registerRepository.saveUser(registerEntity);
	}

	@Override
	public List<RegisterEntity> getAllUser() {
		
		return registerRepository.findAllUser();
	}
	
	
	
	
}
