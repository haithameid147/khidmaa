/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.hello.repositerios;

import com.hello.model.entity.Orders;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author eid
 */
@Repository

public interface ordersRepo extends JpaRepository< Orders , Integer>{
         public List<Orders> findByServiceId(int servicesId);
         public List<Orders> findByCityId(int cityId);

}
