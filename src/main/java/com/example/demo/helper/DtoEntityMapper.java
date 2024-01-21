package com.example.demo.helper;

import java.time.LocalDate;

import com.example.demo.dto.MyDTO;
import com.example.demo.entities.My;

public class DtoEntityMapper {
	
	public static My createMyDtoToMyEntity(MyDTO myDto ) {
		My my=new My();
		my.setMyId(myDto.getId());
		my.setAge(myDto.getAge());
		my.setMyName(myDto.getName());
		my.setCreatedDate(LocalDate.now());
		return my;
	}
	
	public static MyDTO createMyEntityToMyDTO(My my ) {
		MyDTO myDto=new MyDTO();
		myDto.setId(my.getMyId());
		myDto.setAge(my.getAge());
		myDto.setName(my.getMyName());
		return myDto;
	}

}
