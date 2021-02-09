package com.hello.repositerios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hello.model.entity.AdminUser;

@Repository
public interface AdminUserRepo extends JpaRepository <AdminUser, Integer> {

}
