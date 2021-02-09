package com.hello.repositerios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hello.model.entity.Foundation;

@Repository
public interface foundationRepo extends JpaRepository<Foundation, Integer>{
	
	//         public  List<Area> findByCityId(int cityId);
     public List<Foundation> findByServiceId(int servicesId);
     public List<Foundation> findByAppUserId(long appUserId);
     public List<Foundation> findByCityId(int cityId);


}
