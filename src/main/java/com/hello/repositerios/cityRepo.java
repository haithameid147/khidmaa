package com.hello.repositerios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hello.model.entity.City;

@Repository
public interface cityRepo extends JpaRepository <City, Integer>{

}
