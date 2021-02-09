package com.hello.repositerios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hello.model.entity.Service;

@Repository
public interface serviceRepo  extends JpaRepository <Service, Integer>{
	

}
