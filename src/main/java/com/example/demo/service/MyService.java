package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.MyDTO;
import com.example.demo.entities.My;
import com.example.demo.helper.DtoEntityMapper;
import com.example.demo.repositories.MyRepository;

@Service
public class MyService {
	
	@Autowired
	private MyRepository myRepository;
	

	public MyDTO create(MyDTO myDTO) {
		My myEntity = DtoEntityMapper.createMyDtoToMyEntity(myDTO);
		My saveEntity = myRepository.save(myEntity);
		return DtoEntityMapper.createMyEntityToMyDTO(saveEntity);
	}
	
	public MyDTO findById(Integer id) {
		return DtoEntityMapper.createMyEntityToMyDTO(myRepository.findById(id).get());
	}
	
	

}
